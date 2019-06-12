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

package com.scandit.datacapture.barcodecapturesettingssample.settings.view.overlay;

import androidx.annotation.StringRes;
import com.scandit.datacapture.core.ui.style.Brush;

class OverlaySettingsBrushEntry {

    final Brush brush;
    @StringRes final int displayNameRes;

    OverlaySettingsBrushEntry(
            int fillColor, int strokeColor, float strokeWidth, @StringRes int displayNameRes
    ) {
        this(new Brush(fillColor, strokeColor, strokeWidth), displayNameRes);
    }

    OverlaySettingsBrushEntry(Brush brush, @StringRes int displayNameRes) {
        this.brush = brush;
        this.displayNameRes = displayNameRes;
    }
}
