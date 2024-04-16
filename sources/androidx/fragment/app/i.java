package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public class i implements LayoutInflater.Factory2 {
    final FragmentManager a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        m y;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j29.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(j29.b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(j29.c, -1);
            String string = obtainStyledAttributes.getString(j29.d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment k0 = resourceId != -1 ? this.a.k0(resourceId) : null;
            if (k0 == null && string != null) {
                k0 = this.a.l0(string);
            }
            if (k0 == null && id != -1) {
                k0 = this.a.k0(id);
            }
            if (k0 == null) {
                k0 = this.a.x0().a(context.getClassLoader(), attributeValue);
                k0.mFromLayout = true;
                k0.mFragmentId = resourceId != 0 ? resourceId : id;
                k0.mContainerId = id;
                k0.mTag = string;
                k0.mInLayout = true;
                FragmentManager fragmentManager = this.a;
                k0.mFragmentManager = fragmentManager;
                k0.mHost = fragmentManager.z0();
                k0.onInflate(this.a.z0().f(), attributeSet, k0.mSavedFragmentState);
                y = this.a.j(k0);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Fragment " + k0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!k0.mInLayout) {
                k0.mInLayout = true;
                FragmentManager fragmentManager2 = this.a;
                k0.mFragmentManager = fragmentManager2;
                k0.mHost = fragmentManager2.z0();
                k0.onInflate(this.a.z0().f(), attributeSet, k0.mSavedFragmentState);
                y = this.a.y(k0);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + k0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            v64.g(k0, viewGroup);
            k0.mContainer = viewGroup;
            y.m();
            y.j();
            View view2 = k0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (k0.mView.getTag() == null) {
                    k0.mView.setTag(string);
                }
                k0.mView.addOnAttachStateChangeListener(new a(y));
                return k0.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.a.k();
            this.a.m();
            v.n((ViewGroup) k.mView.getParent(), i.this.a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
