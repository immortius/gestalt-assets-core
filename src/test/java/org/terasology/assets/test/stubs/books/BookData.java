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

package org.terasology.assets.test.stubs.books;

import org.terasology.assets.AssetData;

/**
 * @author Immortius
 */
public class BookData implements AssetData {
    private String heading = "";
    private String body = "";

    public BookData() {
    }

    public BookData(String heading, String body) {
        this.heading = heading;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getHeading() {
        return heading;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}