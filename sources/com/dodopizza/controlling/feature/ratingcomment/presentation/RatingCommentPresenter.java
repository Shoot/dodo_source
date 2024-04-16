package com.dodopizza.controlling.feature.ratingcomment.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RatingCommentPresenter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB)\u0012\b\u00101\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b2\u00103J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0014J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0006\u0010\u0011\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\tH\u0016J\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R$\u00100\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ld69;", "Lor3;", "Lb69;", Image.TYPE_SMALL, "", "Lq58;", "ratingPhotos", "", "q", "A", "onFirstViewAttach", "", "comment", "u", DateTokenConverter.CONVERTER_KEY, "v", "onDestroy", "t", "y", "x", "Ljava/io/File;", "photoFile", "w", "Lm59;", "a", "Lm59;", "data", "", "b", "Z", "isCameraAvailable", "Lz59;", c.a, "Lz59;", "router", "Lcr6;", "Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/a;", "Lcr6;", "r", "()Lcr6;", "feedbackPhotosActions", "value", e.a, "Lb69;", "z", "(Lb69;)V", "state", "restoredState", "<init>", "(Lb69;Lm59;ZLz59;)V", "f", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RatingCommentPresenter extends BasePresenter<d69> implements or3 {
    private static final a f = new a(null);
    private final m59 a;
    private final boolean b;
    private final z59 c;
    private final cr6<com.dodopizza.controlling.feature.feedbackphotos.presentation.a> d;
    private b69 e;

    /* compiled from: RatingCommentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter$a;", "", "", "MAX_RATING_PHOTO_SIZE", "I", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RatingCommentPresenter(b69 b69Var, m59 m59Var, boolean z, z59 z59Var) {
        z65.h(m59Var, "data");
        z65.h(z59Var, "router");
        this.a = m59Var;
        this.b = z;
        this.c = z59Var;
        this.d = uha.b(0, 1, null, 5, null);
        this.e = b69Var == null ? s() : b69Var;
    }

    private final void A() {
        List<q58> c = this.e.c();
        int i = 0;
        if (!(c instanceof Collection) || !c.isEmpty()) {
            for (q58 q58Var : c) {
                if (q58Var.a() && (i = i + 1) < 0) {
                    kc1.u();
                }
            }
        }
        if (i > 0) {
            ((d69) getViewState()).ah(i);
        } else {
            this.c.a();
        }
    }

    private final void q(List<q58> list) {
        boolean z = true;
        boolean z2 = !list.isEmpty();
        ((d69) getViewState()).f4(z2);
        ((d69) getViewState()).yf(z2);
        ((d69) getViewState()).U6((list.size() >= 5 || !this.b) ? false : false);
    }

    private final b69 s() {
        List l;
        String a2 = this.a.a();
        l = kc1.l();
        return new b69(a2, l);
    }

    private final void z(b69 b69Var) {
        this.e = b69Var;
        ((d69) getViewState()).g3(b69Var);
    }

    @Override // defpackage.or3
    public void d(List<q58> list) {
        z65.h(list, "ratingPhotos");
        z(b69.b(this.e, null, list, 1, null));
        q(list);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        int w;
        ArrayList<q58> arrayList = new ArrayList();
        for (Object obj : this.e.c()) {
            if (!((q58) obj).e()) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (q58 q58Var : arrayList) {
            arrayList2.add(q58Var.c());
        }
        this.c.b(new y59(this.e.d(), arrayList2));
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        q(this.e.c());
        ((d69) getViewState()).dc(this.e.d());
        ((d69) getViewState()).U7(new nr3(this.a.b()));
    }

    @Override // defpackage.or3
    /* renamed from: r */
    public cr6<com.dodopizza.controlling.feature.feedbackphotos.presentation.a> c() {
        return this.d;
    }

    public final void t() {
        A();
    }

    public final void u(String str) {
        z65.h(str, "comment");
        z(b69.b(this.e, str, null, 2, null));
    }

    public final void v() {
        A();
    }

    public final void w(File file) {
        z65.h(file, "photoFile");
        List<q58> c = this.e.c();
        if (!(c instanceof Collection) || !c.isEmpty()) {
            for (q58 q58Var : c) {
                if (z65.c(q58Var.b(), file.getAbsolutePath())) {
                    return;
                }
            }
        }
        c().a(new a.C0115a(file));
    }

    public final void x() {
        c().a(a.b.a);
    }

    public final void y() {
        c().a(a.c.a);
    }
}
