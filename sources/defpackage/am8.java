package defpackage;

import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
/* compiled from: ProductRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0017"}, d2 = {"Lam8;", "Lyl8;", "", "Lfl8;", c.a, "models", "", "save", "", "id", "a", "Lgk2;", "Lcom/dodopizza/persistence/entity/menu/ProductEntity;", "Lgk2;", "dao", "Ljava/util/concurrent/ExecutorService;", "b", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/Collection;", "cache", "<init>", "(Lgk2;Ljava/util/concurrent/ExecutorService;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: am8  reason: default package */
/* loaded from: classes4.dex */
public final class am8 implements yl8 {
    private final gk2<ProductEntity> a;
    private final ExecutorService b;
    private Collection<? extends fl8> c;

    public am8(gk2<ProductEntity> gk2Var, ExecutorService executorService) {
        List l;
        z65.h(gk2Var, "dao");
        z65.h(executorService, "executorService");
        this.a = gk2Var;
        this.b = executorService;
        l = kc1.l();
        this.c = l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(am8 am8Var, Collection collection) {
        int w;
        z65.h(am8Var, "this$0");
        z65.h(collection, "$models");
        am8Var.a.e();
        gk2<ProductEntity> gk2Var = am8Var.a;
        Collection<fl8> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fl8 fl8Var : collection2) {
            arrayList.add(vm8.t(fl8Var));
        }
        gk2Var.save(arrayList);
    }

    @Override // defpackage.yl8
    public fl8 a(String str) {
        Object obj;
        z65.h(str, "id");
        Iterator<T> it = c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((fl8) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (fl8) obj;
    }

    public Collection<fl8> c() {
        int w;
        if (!this.c.isEmpty()) {
            return this.c;
        }
        List<ProductEntity> b = this.a.b();
        List<ProductEntity> list = b;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ProductEntity productEntity : list) {
            arrayList.add(vm8.m(b, productEntity));
        }
        this.c = arrayList;
        return arrayList;
    }

    @Override // defpackage.yl8
    public void save(final Collection<? extends fl8> collection) {
        z65.h(collection, "models");
        this.c = collection;
        this.b.execute(new Runnable() { // from class: zl8
            @Override // java.lang.Runnable
            public final void run() {
                am8.d(am8.this, collection);
            }
        });
    }
}
