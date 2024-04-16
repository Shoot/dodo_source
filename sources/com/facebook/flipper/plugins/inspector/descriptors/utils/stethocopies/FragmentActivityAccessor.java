package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Activity;
/* loaded from: classes2.dex */
public interface FragmentActivityAccessor<FRAGMENT_ACTIVITY extends Activity, FRAGMENT_MANAGER> {
    FRAGMENT_MANAGER getFragmentManager(FRAGMENT_ACTIVITY fragment_activity);
}
