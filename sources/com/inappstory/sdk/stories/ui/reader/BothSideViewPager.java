package com.inappstory.sdk.stories.ui.reader;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class BothSideViewPager extends ViewPager {
    private int layoutDirection;
    private final HashMap<ViewPager.j, c> mPageChangeListeners;

    /* loaded from: classes3.dex */
    private class c implements ViewPager.j {
        private final ViewPager.j a;

        c(ViewPager.j jVar) {
            this.a = jVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.a.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            int width = BothSideViewPager.this.getWidth();
            androidx.viewpager.widget.a adapter = BothSideViewPager.super.getAdapter();
            if (BothSideViewPager.this.isRtl() && adapter != null) {
                int count = adapter.getCount();
                float f2 = width;
                int pageWidth = ((int) ((1.0f - adapter.getPageWidth(i)) * f2)) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (adapter.getPageWidth(i) * f2);
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = i2 / (f2 * adapter.getPageWidth(i));
            }
            this.a.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            androidx.viewpager.widget.a adapter = BothSideViewPager.super.getAdapter();
            if (BothSideViewPager.this.isRtl() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.a.onPageSelected(i);
        }
    }

    public BothSideViewPager(Context context) {
        super(context);
        this.mPageChangeListeners = new HashMap<>();
        this.layoutDirection = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRtl() {
        if (this.layoutDirection == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NonNull ViewPager.j jVar) {
        c cVar = new c(jVar);
        this.mPageChangeListeners.put(jVar, cVar);
        super.addOnPageChangeListener(cVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.mPageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public androidx.viewpager.widget.a getAdapter() {
        b bVar = (b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.getDelegate();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && isRtl()) {
            return (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.layoutDirection = savedState.mLayoutDirection;
        super.onRestoreInstanceState(savedState.mViewPagerSavedState);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.layoutDirection) {
            androidx.viewpager.widget.a adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.layoutDirection = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.layoutDirection);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NonNull ViewPager.j jVar) {
        c remove = this.mPageChangeListeners.remove(jVar);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(androidx.viewpager.widget.a aVar) {
        if (aVar != null) {
            aVar = new b(aVar);
        }
        super.setAdapter(aVar);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && isRtl()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Deprecated
    public void setOnPageChangeListener(@NonNull ViewPager.j jVar) {
        super.setOnPageChangeListener(new c(jVar));
    }

    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();
        private final int mLayoutDirection;
        private final Parcelable mViewPagerSavedState;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.mViewPagerSavedState, i);
            parcel.writeInt(this.mLayoutDirection);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.mViewPagerSavedState = parcelable;
            this.mLayoutDirection = i;
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.mLayoutDirection = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    private class b extends PagerAdapterDelegate {
        b(@NonNull androidx.viewpager.widget.a aVar) {
            super(aVar);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        public int getItemPosition(@NonNull Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (BothSideViewPager.this.isRtl()) {
                if (itemPosition != -1 && itemPosition != -2) {
                    return (getCount() - itemPosition) - 1;
                }
                return -2;
            }
            return itemPosition;
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        public float getPageWidth(int i) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        @Deprecated
        public void destroyItem(@NonNull View view, int i, @NonNull Object obj) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        @NonNull
        @Deprecated
        public Object instantiateItem(@NonNull View view, int i) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // com.inappstory.sdk.stories.ui.reader.PagerAdapterDelegate, androidx.viewpager.widget.a
        @Deprecated
        public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj) {
            if (BothSideViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }
    }

    public BothSideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPageChangeListeners = new HashMap<>();
        this.layoutDirection = 0;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && isRtl()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }
}
