package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import com.facebook.flipper.plugins.uidebugger.core.ApplicationRef;
import com.facebook.flipper.plugins.uidebugger.core.RootViewResolver;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ApplicationDescriptor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J&\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ApplicationDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationRef;", "()V", "rootResolver", "Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver;", "getRootResolver", "()Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver;", "onGetChildren", "", "applicationRef", "children", "", "", "onGetData", "builder", "", "", "onGetId", "onGetName", "onInit", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationDescriptor extends AbstractChainedDescriptor<ApplicationRef> {
    private final RootViewResolver rootResolver = new RootViewResolver();

    public final RootViewResolver getRootResolver() {
        return this.rootResolver;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(ApplicationRef applicationRef, List list) {
        onGetChildren2(applicationRef, (List<Object>) list);
    }

    /* renamed from: onGetData  reason: avoid collision after fix types in other method */
    public void onGetData2(ApplicationRef applicationRef, Map<String, Object> map) {
        z65.h(applicationRef, "applicationRef");
        z65.h(map, "builder");
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(ApplicationRef applicationRef, List<Object> list) {
        z65.h(applicationRef, "applicationRef");
        z65.h(list, "children");
        List<RootViewResolver.RootView> listActiveRootViews = this.rootResolver.listActiveRootViews();
        if (listActiveRootViews == null) {
            return;
        }
        for (RootViewResolver.RootView rootView : listActiveRootViews) {
            z65.g(rootView, "roots");
            RootViewResolver.RootView rootView2 = rootView;
            Iterator<Activity> it = applicationRef.getActivitiesStack().iterator();
            while (true) {
                if (it.hasNext()) {
                    Activity next = it.next();
                    if (z65.c(next.getWindow().getDecorView(), rootView2.getView())) {
                        list.add(next);
                        break;
                    }
                } else {
                    list.add(rootView2.getView());
                    break;
                }
            }
        }
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetData(ApplicationRef applicationRef, Map map) {
        onGetData2(applicationRef, (Map<String, Object>) map);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetId(ApplicationRef applicationRef) {
        z65.h(applicationRef, "applicationRef");
        String packageName = applicationRef.getApplication().getPackageName();
        z65.g(packageName, "applicationRef.application.packageName");
        return packageName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetName(ApplicationRef applicationRef) {
        z65.h(applicationRef, "applicationRef");
        ApplicationInfo applicationInfo = applicationRef.getApplication().getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        String string = applicationRef.getApplication().getString(i);
        z65.g(string, "applicationRef.application.getString(stringId)");
        return string;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public void onInit() {
    }
}
