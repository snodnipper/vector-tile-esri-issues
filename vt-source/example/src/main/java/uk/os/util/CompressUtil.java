/*
 * Copyright (C) 2016 Ordnance Survey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.os.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class CompressUtil {

    private static final Logger LOG = LoggerFactory.getLogger(CompressUtil.class.getSimpleName());
    private static final int KIBIBYTE = 1024;

    private CompressUtil(){}

    // Source: https://www.javacodegeeks.com/2015/01/working-with-gzip-and-compressed-data.html
    public static boolean isGZIPStream(byte[] bytes) {
        return bytes[0] == (byte) GZIPInputStream.GZIP_MAGIC
                && bytes[1] == (byte) (GZIPInputStream.GZIP_MAGIC >>> 8);
    }

    public static byte[] getUncompressedFromGzip(byte[] compressed) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        GZIPInputStream gzipper = null;
        try {
            byte[] buffer = new byte[KIBIBYTE];
            gzipper = new GZIPInputStream(new ByteArrayInputStream(compressed));

            int len;
            while ((len = gzipper.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }

            gzipper.close();
            out.close();
            return out.toByteArray();
        } finally {
            if (gzipper != null) {
                try {
                    gzipper.close();
                } catch (IOException e) {
                    LOG.error("cannot close gzip stream after uncompression failure", e);
                }
            }
        }
    }

    public static byte[] getCompressedAsGzip(byte[] uncompressed) throws IOException {
        GZIPOutputStream gzipper = null;

        try {
            // closing a ByteArrayOutputStream has no effect, thus ignored.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            gzipper = new GZIPOutputStream(out);
            gzipper.write(uncompressed);
            gzipper.close();
            return out.toByteArray();
        } finally {
            if (gzipper != null) {
                try {
                    gzipper.close();
                } catch (IOException e) {
                    LOG.error("cannot close gzip stream after compression failure", e);
                }
            }
        }
    }
}
