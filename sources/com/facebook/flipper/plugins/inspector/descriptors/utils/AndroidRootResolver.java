package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AndroidRootResolver {
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

    /* loaded from: classes2.dex */
    public static class Root {
        public final WindowManager.LayoutParams param;
        public final View view;

        private Root(View view, WindowManager.LayoutParams layoutParams) {
            this.view = view;
            this.param = layoutParams;
        }
    }

    private void initialize() {
        this.initialized = true;
        try {
            Class<?> cls = Class.forName(WINDOW_MANAGER_GLOBAL_CLAZZ);
            this.windowManagerObj = cls.getMethod(GET_GLOBAL_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
            this.viewsField = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField(WINDOW_PARAMS_FIELD);
            this.paramsField = declaredField2;
            declaredField2.setAccessible(true);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
    }

    public List<Root> listActiveRoots() {
        Field field;
        if (!this.initialized) {
            initialize();
        }
        Object obj = this.windowManagerObj;
        if (obj == null || (field = this.viewsField) == null || this.paramsField == null) {
            return null;
        }
        try {
            List list = (List) field.get(obj);
            List list2 = (List) this.paramsField.get(this.windowManagerObj);
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Root((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
            }
            return arrayList;
        } catch (IllegalAccessException | RuntimeException unused) {
            return null;
        }
    }
}
