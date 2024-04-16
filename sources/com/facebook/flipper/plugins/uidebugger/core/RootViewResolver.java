package com.facebook.flipper.plugins.uidebugger.core;

import android.view.View;
import android.view.WindowManager;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RootViewResolver.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver;", "", "()V", "initialized", "", "paramsField", "Ljava/lang/reflect/Field;", "viewsField", "windowManagerObj", "attachListener", "", "listener", "Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$Listener;", "initialize", "listActiveRootViews", "Ljava/util/List;", "Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$RootView;", "Companion", "Listener", "ObservableArrayList", "RootView", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RootViewResolver {
    private static final String GET_DEFAULT_IMPL = "getDefault";
    private static final String GET_GLOBAL_INSTANCE = "getInstance";
    private static final String VIEWS_FIELD = "mViews";
    private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
    private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
    private static final String WINDOW_PARAMS_FIELD = "mParams";
    private boolean initialized;
    private Field paramsField;
    private Field viewsField;
    private Object windowManagerObj;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = RootViewResolver.class.getSimpleName();

    /* compiled from: RootViewResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$Companion;", "", "()V", "GET_DEFAULT_IMPL", "", "GET_GLOBAL_INSTANCE", "TAG", "kotlin.jvm.PlatformType", "VIEWS_FIELD", "WINDOW_MANAGER_GLOBAL_CLAZZ", "WINDOW_MANAGER_IMPL_CLAZZ", "WINDOW_PARAMS_FIELD", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RootViewResolver.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$Listener;", "", "onRootViewAdded", "", "rootView", "Landroid/view/View;", "onRootViewRemoved", "onRootViewsChanged", "Ljava/util/List;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Listener {
        void onRootViewAdded(View view);

        void onRootViewRemoved(View view);

        void onRootViewsChanged(List<View> list);
    }

    /* compiled from: RootViewResolver.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$ObservableArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "()V", "listener", "Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$Listener;", CartQueueItemEntity.OPERATION_ADD, "", "value", CartQueueItemEntity.OPERATION_REMOVE, "removeAt", "index", "", "setListener", "", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ObservableArrayList extends ArrayList<View> {
        private Listener listener;

        public /* bridge */ boolean contains(View view) {
            return super.contains((Object) view);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(View view) {
            return super.indexOf((Object) view);
        }

        public /* bridge */ int lastIndexOf(View view) {
            return super.lastIndexOf((Object) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ View remove(int i) {
            return removeAt(i);
        }

        public View removeAt(int i) {
            Object remove = super.remove(i);
            z65.g(remove, "super.removeAt(index)");
            View view = (View) remove;
            Listener listener = this.listener;
            if (listener != null) {
                listener.onRootViewRemoved(view);
                listener.onRootViewsChanged(this);
            }
            return view;
        }

        public final void setListener(Listener listener) {
            this.listener = listener;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(View view) {
            z65.h(view, "value");
            boolean add = super.add((ObservableArrayList) view);
            Listener listener = this.listener;
            if (listener != null) {
                listener.onRootViewAdded(view);
                listener.onRootViewsChanged(this);
            }
            return add;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return remove((View) obj);
            }
            return false;
        }

        public boolean remove(View view) {
            z65.h(view, "value");
            boolean remove = super.remove((Object) view);
            Listener listener = this.listener;
            if (listener != null) {
                listener.onRootViewRemoved(view);
                listener.onRootViewsChanged(this);
            }
            return remove;
        }
    }

    /* compiled from: RootViewResolver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver$RootView;", "", "view", "Landroid/view/View;", RemoteMessageConst.MessageBody.PARAM, "Landroid/view/WindowManager$LayoutParams;", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;)V", "getParam", "()Landroid/view/WindowManager$LayoutParams;", "getView", "()Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RootView {
        private final WindowManager.LayoutParams param;
        private final View view;

        public RootView(View view, WindowManager.LayoutParams layoutParams) {
            z65.h(view, "view");
            z65.h(layoutParams, RemoteMessageConst.MessageBody.PARAM);
            this.view = view;
            this.param = layoutParams;
        }

        public final WindowManager.LayoutParams getParam() {
            return this.param;
        }

        public final View getView() {
            return this.view;
        }
    }

    private final void initialize() {
        this.initialized = true;
        try {
            Class<?> cls = Class.forName(WINDOW_MANAGER_GLOBAL_CLAZZ);
            this.windowManagerObj = cls.getMethod(GET_GLOBAL_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
            this.viewsField = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField(WINDOW_PARAMS_FIELD);
            this.paramsField = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
    }

    public final void attachListener(Listener listener) {
        if (listener == null) {
            return;
        }
        if (!this.initialized) {
            initialize();
        }
        try {
            Field field = this.viewsField;
            if (field != null) {
                Field declaredField = Field.class.getDeclaredField("accessFlags");
                declaredField.setAccessible(true);
                declaredField.setInt(field, field.getModifiers() & (-17));
                Object obj = field.get(this.windowManagerObj);
                if (obj != null) {
                    ObservableArrayList observableArrayList = new ObservableArrayList();
                    observableArrayList.setListener(listener);
                    observableArrayList.addAll((List) obj);
                    field.set(this.windowManagerObj, observableArrayList);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.List<android.view.View>");
            }
        } catch (Throwable unused) {
        }
    }

    public final List<RootView> listActiveRootViews() {
        Field field;
        List list;
        if (!this.initialized) {
            initialize();
        }
        Object obj = this.windowManagerObj;
        List list2 = null;
        if (obj == null || (field = this.viewsField) == null || this.paramsField == null) {
            return null;
        }
        if (field == null) {
            list = null;
        } else {
            try {
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    list = (List) obj2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.util.List<android.view.View>");
                }
            } catch (IllegalAccessException | RuntimeException unused) {
                return null;
            }
        }
        Field field2 = this.paramsField;
        if (field2 != null) {
            Object obj3 = field2.get(this.windowManagerObj);
            if (obj3 != null) {
                list2 = (List) obj3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.List<android.view.WindowManager.LayoutParams>");
            }
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list2 != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Object obj4 = list.get(i);
                z65.g(obj4, "views[i]");
                Object obj5 = list2.get(i);
                z65.g(obj5, "params[i]");
                arrayList.add(new RootView((View) obj4, (WindowManager.LayoutParams) obj5));
                i = i2;
            }
        }
        return arrayList;
    }
}
