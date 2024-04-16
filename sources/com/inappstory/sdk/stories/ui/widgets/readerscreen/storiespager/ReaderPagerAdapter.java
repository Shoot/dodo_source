package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.ui.reader.ReaderManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class ReaderPagerAdapter extends n {
    private HashMap<Integer, ReaderPageFragment> fragMap;
    ReaderManager manager;
    String readerSettings;
    int source;
    private List<Integer> storiesIds;
    Serializable timerGradient;

    public ReaderPagerAdapter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
        this.storiesIds = new ArrayList();
        this.source = 0;
        this.fragMap = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.storiesIds.size();
    }

    @Override // androidx.fragment.app.n
    @NonNull
    public Fragment getItem(int i) {
        ReaderPageFragment readerPageFragment = new ReaderPageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("story_id", this.storiesIds.get(i).intValue());
        bundle.putInt(KustoStorage.KustoTable.COLUMN_SOURCE, this.source);
        bundle.putString(AppearanceManager.CS_READER_SETTINGS, this.readerSettings);
        bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, this.timerGradient);
        readerPageFragment.setArguments(bundle);
        readerPageFragment.parentManager = this.manager;
        return readerPageFragment;
    }

    public int getItemId(int i) {
        if (i < this.storiesIds.size()) {
            return this.storiesIds.get(i).intValue();
        }
        return -1;
    }

    @Override // androidx.fragment.app.n, androidx.viewpager.widget.a
    public Parcelable saveState() {
        try {
            Bundle bundle = (Bundle) super.saveState();
            bundle.putParcelableArray("states", null);
            return bundle;
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            return new Bundle();
        }
    }

    public ReaderPagerAdapter(@NonNull FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        this.storiesIds = new ArrayList();
        this.source = 0;
        this.fragMap = new HashMap<>();
    }

    public ReaderPagerAdapter(@NonNull FragmentManager fragmentManager, int i, String str, Serializable serializable, List<Integer> list, ReaderManager readerManager) {
        super(fragmentManager);
        this.storiesIds = new ArrayList();
        this.source = 0;
        this.fragMap = new HashMap<>();
        this.storiesIds.clear();
        this.source = i;
        this.storiesIds.addAll(list);
        this.readerSettings = str;
        this.timerGradient = serializable;
        this.manager = readerManager;
    }
}
