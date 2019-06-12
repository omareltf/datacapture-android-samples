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

package com.scandit.datacapture.barcodecapturesettingssample.settings.barcodecapture.location.locationtypes;

import androidx.annotation.StringRes;
import com.scandit.datacapture.barcodecapturesettingssample.R;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.impl.area.NoLocationSelection;

public class LocationTypeNone extends LocationType {

    public static LocationTypeNone fromCurrentLocationSelection(LocationSelection selection) {
        return new LocationTypeNone(
                R.string.none,
                selection == null || selection instanceof NoLocationSelection
        );
    }

    private LocationTypeNone(@StringRes int displayNameRes, boolean enabled) {
        super(displayNameRes, enabled);
    }

    @Override
    public LocationSelection buildLocationSelection() {
        return new NoLocationSelection();
    }
}