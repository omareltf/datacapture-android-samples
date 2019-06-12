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

package com.scandit.datacapture.barcodecapturesettingssample.settings.view.pointofinterest.y;

import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.scandit.datacapture.barcodecapturesettingssample.R;
import com.scandit.datacapture.barcodecapturesettingssample.base.measureunit.MeasureUnitFragment;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;

public class PointOfInterestYFragment extends MeasureUnitFragment {

    public static PointOfInterestYFragment newInstance() {
        return new PointOfInterestYFragment();
    }

    private PointOfInterestYViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(PointOfInterestYViewModel.class);
    }

    @Override
    public FloatWithUnit provideCurrentFloatWithUnit() {
        return viewModel.getPointOfInterestY();
    }

    @Override
    public void onValueChanged(float newValue) {
        viewModel.setPointOfInterestYValue(newValue);
        refreshMeasureUnitAdapterData();
    }

    @Override
    public void onMeasureUnitChanged(MeasureUnit measureUnit) {
        viewModel.setPointOfInterestYMeasureUnit(measureUnit);
        refreshMeasureUnitAdapterData();
    }

    @Override
    protected String getTitle() {
        return getString(R.string.y);
    }
}
