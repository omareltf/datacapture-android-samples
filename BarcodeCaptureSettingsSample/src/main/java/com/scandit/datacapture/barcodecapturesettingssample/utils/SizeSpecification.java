/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scandit.datacapture.barcodecapturesettingssample.utils;

import androidx.annotation.StringRes;
import com.scandit.datacapture.barcodecapturesettingssample.R;

public enum SizeSpecification {
    WIDTH_AND_HEIGHT(R.string.width_and_height),
    WIDTH_AND_HEIGHT_ASPECT(R.string.width_and_height_aspect),
    HEIGHT_AND_WIDTH_ASPECT(R.string.height_and_width_aspect);

    @StringRes public final int displayName;

    SizeSpecification(@StringRes int displayName) {
        this.displayName = displayName;
    }
}