/*
 * Copyright (C) 2020 olie.xdev <olie.xdev@googlemail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.health.openworkout.core.workout;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;

public class RussianTwist extends WorkoutItem {
    public RussianTwist() {
        super();
        setName(getContext().getString(R.string.workout_name_russian_twist));
        setDescription(getContext().getString(R.string.workout_description_russian_twist));
        setImagePath("russian_twist.png");
        setVideoPath("russian_twist.mp4");
        setTimeMode(false);
    }
}
