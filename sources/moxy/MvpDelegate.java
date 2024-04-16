package moxy;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import moxy.MvpDelegate;
import moxy.presenter.PresenterField;
/* loaded from: classes3.dex */
public class MvpDelegate<Delegated> {
    private static final Comparator<PresenterField> COMPARE_BY_TAGS = new Comparator() { // from class: mr6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = MvpDelegate.lambda$static$0((PresenterField) obj, (PresenterField) obj2);
            return lambda$static$0;
        }
    };
    private static final String KEY_TAG = "moxy.MvpDelegate.KEY_TAG";
    public static final String MOXY_DELEGATE_TAGS_KEY = "MoxyDelegateBundle";
    private Bundle bundle;
    private String delegateTag;
    private final Delegated delegated;
    private boolean isAttached;
    private MvpDelegate parentDelegate;
    private String keyTag = KEY_TAG;
    private Set<PresenterField<? super Delegated>> externalPresenterFields = new TreeSet(COMPARE_BY_TAGS);
    private List<MvpPresenter<? super Delegated>> presenters = Collections.emptyList();
    private List<MvpDelegate> childDelegates = new ArrayList();

    public MvpDelegate(Delegated delegated) {
        this.delegated = delegated;
    }

    private void addChildDelegate(MvpDelegate mvpDelegate) {
        this.childDelegates.add(mvpDelegate);
    }

    private void closeCoroutineScope(MvpPresenter mvpPresenter) {
        OnDestroyListener onDestroyListener = mvpPresenter.coroutineScope;
        if (onDestroyListener != null) {
            onDestroyListener.onDestroy();
        } else {
            mvpPresenter.coroutineScope = OnDestroyListener.EMPTY;
        }
    }

    private String generateTag() {
        String str;
        if (this.parentDelegate == null) {
            str = "";
        } else {
            str = this.parentDelegate.delegateTag + " ";
        }
        return str + this.delegated.getClass().getSimpleName() + "$" + getClass().getSimpleName() + toString().replace(getClass().getName(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(PresenterField presenterField, PresenterField presenterField2) {
        return presenterField.getTag(null).compareTo(presenterField2.getTag(null));
    }

    private void removeChildDelegate(MvpDelegate mvpDelegate) {
        this.childDelegates.remove(mvpDelegate);
    }

    public void freeParentDelegate() {
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate != null) {
            mvpDelegate.removeChildDelegate(this);
            return;
        }
        throw new IllegalStateException("You should call freeParentDelegate() before first call to setParentDelegate()");
    }

    public Bundle getChildrenSaveState() {
        return this.bundle;
    }

    public void onAttach() {
        for (MvpPresenter<? super Delegated> mvpPresenter : this.presenters) {
            if (!this.isAttached || !mvpPresenter.getAttachedViews().contains(this.delegated)) {
                mvpPresenter.attachView((MvpView) this.delegated);
            }
        }
        for (MvpDelegate mvpDelegate : this.childDelegates) {
            mvpDelegate.onAttach();
        }
        this.isAttached = true;
    }

    public void onCreate() {
        Bundle bundle = new Bundle();
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate != null) {
            bundle = mvpDelegate.bundle;
        }
        onCreate(bundle);
    }

    public void onDestroy() {
        PresentersCounter presentersCounter = MvpFacade.getInstance().getPresentersCounter();
        PresenterStore presenterStore = MvpFacade.getInstance().getPresenterStore();
        for (MvpPresenter mvpPresenter : presentersCounter.getAll(this.delegateTag)) {
            if (presentersCounter.rejectPresenter(mvpPresenter, this.delegateTag)) {
                presenterStore.remove(mvpPresenter.getTag());
                closeCoroutineScope(mvpPresenter);
                mvpPresenter.onDestroy();
            }
        }
    }

    public void onDestroyView() {
        for (MvpPresenter<? super Delegated> mvpPresenter : this.presenters) {
            mvpPresenter.destroyView((MvpView) this.delegated);
        }
        ArrayList<MvpDelegate> arrayList = new ArrayList(this.childDelegates.size());
        arrayList.addAll(this.childDelegates);
        for (MvpDelegate mvpDelegate : arrayList) {
            mvpDelegate.onSaveInstanceState();
            mvpDelegate.onDestroyView();
        }
        if (this.parentDelegate != null) {
            freeParentDelegate();
        }
    }

    public void onDetach() {
        for (MvpPresenter<? super Delegated> mvpPresenter : this.presenters) {
            if (this.isAttached || mvpPresenter.getAttachedViews().contains(this.delegated)) {
                mvpPresenter.detachView((MvpView) this.delegated);
            }
        }
        this.isAttached = false;
        for (MvpDelegate mvpDelegate : this.childDelegates) {
            mvpDelegate.onDetach();
        }
    }

    public void onSaveInstanceState() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate != null && (bundle = mvpDelegate.bundle) != null) {
            bundle2 = bundle;
        }
        onSaveInstanceState(bundle2);
    }

    public void registerExternalPresenterField(PresenterField<? super Delegated> presenterField) {
        this.externalPresenterFields.add(presenterField);
    }

    public void removeAllChildDelegates() {
        ArrayList<MvpDelegate> arrayList = new ArrayList(this.childDelegates.size());
        arrayList.addAll(this.childDelegates);
        for (MvpDelegate mvpDelegate : arrayList) {
            mvpDelegate.freeParentDelegate();
        }
        this.childDelegates = new ArrayList();
    }

    public void setParentDelegate(MvpDelegate mvpDelegate, String str) {
        if (this.bundle == null) {
            List<MvpDelegate> list = this.childDelegates;
            if (list != null && list.size() > 0) {
                throw new IllegalStateException("You could not set parent delegate when there are some child presenters already");
            }
            this.parentDelegate = mvpDelegate;
            this.keyTag = this.parentDelegate.keyTag + "$" + str;
            mvpDelegate.addChildDelegate(this);
            return;
        }
        throw new IllegalStateException("You should call setParentDelegate() before first call to onCreate()");
    }

    public void onCreate(Bundle bundle) {
        if (this.parentDelegate == null && bundle != null) {
            bundle = bundle.getBundle(MOXY_DELEGATE_TAGS_KEY);
        }
        this.isAttached = false;
        Bundle bundle2 = bundle != null ? bundle : new Bundle();
        this.bundle = bundle2;
        if (bundle != null && bundle2.containsKey(this.keyTag)) {
            this.delegateTag = bundle.getString(this.keyTag);
        } else {
            this.delegateTag = generateTag();
        }
        this.presenters = MvpFacade.getInstance().getMvpProcessor().getMvpPresenters(this.delegated, this.delegateTag, this.externalPresenterFields);
        for (MvpDelegate mvpDelegate : this.childDelegates) {
            mvpDelegate.onCreate(bundle);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.parentDelegate == null) {
            Bundle bundle2 = new Bundle();
            bundle.putBundle(MOXY_DELEGATE_TAGS_KEY, bundle2);
            bundle = bundle2;
        }
        bundle.putAll(this.bundle);
        bundle.putString(this.keyTag, this.delegateTag);
        for (MvpDelegate mvpDelegate : this.childDelegates) {
            mvpDelegate.onSaveInstanceState(bundle);
        }
    }
}
