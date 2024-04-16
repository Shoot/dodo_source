package com.inappstory.sdk.stories.ui.reader;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class PagerAdapterDelegate extends androidx.viewpager.widget.a {
    private final androidx.viewpager.widget.a mDelegate;

    /* loaded from: classes3.dex */
    private static class b extends DataSetObserver {
        final PagerAdapterDelegate a;

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerAdapterDelegate pagerAdapterDelegate = this.a;
            if (pagerAdapterDelegate != null) {
                pagerAdapterDelegate.superNotifyDataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            onChanged();
        }

        private b(PagerAdapterDelegate pagerAdapterDelegate) {
            this.a = pagerAdapterDelegate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PagerAdapterDelegate(@NonNull androidx.viewpager.widget.a aVar) {
        this.mDelegate = aVar;
        aVar.registerDataSetObserver(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void superNotifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        this.mDelegate.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        this.mDelegate.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.mDelegate.getCount();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.viewpager.widget.a getDelegate() {
        return this.mDelegate;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(@NonNull Object obj) {
        return this.mDelegate.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i) {
        return this.mDelegate.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.a
    public float getPageWidth(int i) {
        return this.mDelegate.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return this.mDelegate.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return this.mDelegate.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        this.mDelegate.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.a
    public void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mDelegate.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.mDelegate.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return this.mDelegate.saveState();
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        this.mDelegate.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        this.mDelegate.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mDelegate.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.a
    @Deprecated
    public void destroyItem(@NonNull View view, int i, @NonNull Object obj) {
        this.mDelegate.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    @Deprecated
    public void finishUpdate(@NonNull View view) {
        this.mDelegate.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    @Deprecated
    public Object instantiateItem(@NonNull View view, int i) {
        return this.mDelegate.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.a
    @Deprecated
    public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj) {
        this.mDelegate.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    @Deprecated
    public void startUpdate(@NonNull View view) {
        this.mDelegate.startUpdate(view);
    }
}
