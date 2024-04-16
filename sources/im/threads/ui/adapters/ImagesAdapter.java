package im.threads.ui.adapters;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.FileDescription;
import im.threads.ui.adapters.ImagesAdapter;
import im.threads.ui.fragments.ImageFragment;
import im.threads.ui.utils.ThreadRunnerKt;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ImagesAdapter extends androidx.viewpager.widget.a {
    private final List<FileDescription> fileDescriptions;
    private final FragmentManager mFragmentManager;
    private p mCurTransaction = null;
    private final ArrayList<Fragment.SavedState> mSavedState = new ArrayList<>();
    private final ArrayList<Fragment> mFragments = new ArrayList<>();
    private Fragment mCurrentPrimaryItem = null;

    public ImagesAdapter(List<FileDescription> list, FragmentManager fragmentManager) {
        this.fileDescriptions = list;
        this.mFragmentManager = fragmentManager;
    }

    private Fragment getItem(int i) {
        return ImageFragment.createImageFragment(this.fileDescriptions.get(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishUpdate$0() {
        p pVar = this.mCurTransaction;
        if (pVar != null) {
            pVar.l();
            this.mCurTransaction = null;
            this.mFragmentManager.h0();
        }
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.p();
        }
        LoggerEdna.verbose("Removing item #" + i + ": f=" + obj + " v=" + fragment.getView());
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.mSavedState;
        if (fragment.isAdded()) {
            savedState = this.mFragmentManager.w1(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.mFragments.set(i, null);
        this.mCurTransaction.t(fragment);
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        ThreadRunnerKt.runOnUiThread(new Runnable() { // from class: ow4
            @Override // java.lang.Runnable
            public final void run() {
                ImagesAdapter.this.lambda$finishUpdate$0();
            }
        });
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.fileDescriptions.size();
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.mFragments.size() > i && (fragment = this.mFragments.get(i)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.p();
        }
        Fragment item = getItem(i);
        LoggerEdna.verbose("Adding item #" + i + ": f=" + item);
        if (this.mSavedState.size() > i && (savedState = this.mSavedState.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(i, item);
        this.mCurTransaction.b(viewGroup.getId(), item);
        return item;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment v0 = this.mFragmentManager.v0(bundle, str);
                    if (v0 != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                        }
                        v0.setMenuVisibility(false);
                        this.mFragments.set(parseInt, v0);
                    } else {
                        LoggerEdna.warning("Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.n1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
    }
}
