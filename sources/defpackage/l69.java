package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.orderrating.RatingPhotoEntity;
import com.huawei.hms.push.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RatingPhotoServiceImpl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Ll69;", "Lk69;", "", "path", "Ljava/io/File;", e.a, "orderId", "", "Lh69;", DateTokenConverter.CONVERTER_KEY, "photo", "Ltrb;", "progressListener", "", "b", "photoFilePath", "a", com.huawei.hms.opendevice.c.a, "Lj69;", "Lj69;", "photoRepository", "Lku3;", "Lku3;", "fileUploader", "Lwo1;", "Lwo1;", "compressFactory", "<init>", "(Lj69;Lku3;Lwo1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l69  reason: default package */
/* loaded from: classes.dex */
public final class l69 implements k69 {
    private final j69 a;
    private final ku3 b;
    private final wo1 c;

    /* compiled from: RatingPhotoServiceImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/orderrating/RatingPhotoEntity;", "queryBuilder", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l69$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<vu8<RatingPhotoEntity>, vu8<RatingPhotoEntity>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<RatingPhotoEntity> invoke(vu8<RatingPhotoEntity> vu8Var) {
            z65.h(vu8Var, "queryBuilder");
            return vu8Var.b("orderId", this.a);
        }
    }

    /* compiled from: RatingPhotoServiceImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/orderrating/RatingPhotoEntity;", "queryBuilder", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l69$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<vu8<RatingPhotoEntity>, vu8<RatingPhotoEntity>> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<RatingPhotoEntity> invoke(vu8<RatingPhotoEntity> vu8Var) {
            z65.h(vu8Var, "queryBuilder");
            return vu8Var.b("orderId", this.a).b("filePath", this.b);
        }
    }

    /* compiled from: RatingPhotoServiceImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/orderrating/RatingPhotoEntity;", "queryBuilder", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l69$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<vu8<RatingPhotoEntity>, vu8<RatingPhotoEntity>> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<RatingPhotoEntity> invoke(vu8<RatingPhotoEntity> vu8Var) {
            z65.h(vu8Var, "queryBuilder");
            return vu8Var.b("orderId", this.a).b("filePath", this.b);
        }
    }

    public l69(j69 j69Var, ku3 ku3Var, wo1 wo1Var) {
        z65.h(j69Var, "photoRepository");
        z65.h(ku3Var, "fileUploader");
        z65.h(wo1Var, "compressFactory");
        this.a = j69Var;
        this.b = ku3Var;
        this.c = wo1Var;
    }

    private final File e(String str) {
        return uo1.e(this.c.a(new File(str)), 768, 1024, null, 85, 4, null).a();
    }

    @Override // defpackage.k69
    public void a(String str, String str2, trb trbVar) {
        z65.h(str, "orderId");
        z65.h(str2, "photoFilePath");
        z65.h(trbVar, "progressListener");
        h69 h69Var = (h69) mh5.b(this.a.x(new c(str, str2)), "Can't restore uploading, cause rating photo not found in DB");
        this.b.a(h69Var.f(), new File(h69Var.c()), trbVar);
        this.a.C(h69.b(h69Var, null, null, null, null, true, 15, null));
    }

    @Override // defpackage.k69
    public void b(String str, File file, trb trbVar) {
        z65.h(str, "orderId");
        z65.h(file, "photo");
        z65.h(trbVar, "progressListener");
        String createUploadId = this.b.createUploadId();
        String absolutePath = file.getAbsolutePath();
        z65.g(absolutePath, "getAbsolutePath(...)");
        File e = e(absolutePath);
        String absolutePath2 = file.getAbsolutePath();
        z65.g(absolutePath2, "getAbsolutePath(...)");
        String absolutePath3 = e.getAbsolutePath();
        z65.g(absolutePath3, "getAbsolutePath(...)");
        h69 h69Var = new h69(createUploadId, str, absolutePath2, absolutePath3, false);
        this.a.C(h69Var);
        this.b.a(createUploadId, e, trbVar);
        this.a.C(h69.b(h69Var, null, null, null, null, true, 15, null));
    }

    @Override // defpackage.k69
    public void c(String str, String str2) {
        z65.h(str, "orderId");
        z65.h(str2, "photoFilePath");
        h69 x = this.a.x(new b(str, str2));
        if (x != null) {
            new File(x.c()).delete();
            this.a.y(x);
        }
    }

    @Override // defpackage.k69
    public Collection<h69> d(String str) {
        z65.h(str, "orderId");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a.v(new a(str))) {
            if (new File(((h69) obj).d()).exists()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
