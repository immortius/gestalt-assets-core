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

package org.terasology.assets.test.stubs.extensions;

import org.terasology.assets.AssetFactory;
import org.terasology.assets.module.annotations.RegisterAssetType;
import org.terasology.naming.ResourceUrn;

/**
 * @author Immortius
 */
@RegisterAssetType("extension")
public class ExtensionFactory implements AssetFactory<ExtensionAsset, ExtensionData> {

    @Override
    public ExtensionAsset build(ResourceUrn urn, ExtensionData data) {
        return new ExtensionAsset(urn, data);
    }
}
