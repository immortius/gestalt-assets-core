/*
 * Copyright 2014 MovingBlocks
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

package org.terasology.assets.test.stubs.book;

import com.google.common.io.CharStreams;
import org.terasology.assets.AssetInput;
import org.terasology.assets.module.AbstractAssetFormat;
import org.terasology.naming.ResourceUrn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author Immortius
 */
public class BookFormat extends AbstractAssetFormat<BookData> {

    public BookFormat() {
        super("book");
    }

    @Override
    public BookData load(ResourceUrn urn, List<AssetInput> inputs) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputs.get(0).openStream()))) {
            return new BookData(CharStreams.readLines(reader));
        }
    }
}
