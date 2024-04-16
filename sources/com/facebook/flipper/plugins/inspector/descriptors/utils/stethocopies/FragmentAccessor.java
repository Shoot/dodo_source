package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.content.res.Resources;
import android.view.View;
/* loaded from: classes2.dex */
public interface FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> {
    public static final int NO_ID = 0;

    FRAGMENT_MANAGER getChildFragmentManager(FRAGMENT fragment);

    FRAGMENT_MANAGER getFragmentManager(FRAGMENT fragment);

    int getId(FRAGMENT fragment);

    Resources getResources(FRAGMENT fragment);

    String getTag(FRAGMENT fragment);

    View getView(FRAGMENT fragment);
}
