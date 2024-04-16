package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ImageLoaderRequest.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R)\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lyu4;", "", "Lxu4;", e.a, "", "a", "Ljava/lang/String;", RemoteMessageConst.Notification.URL, "", "b", "I", "placeholderResId", "Lzu4;", com.huawei.hms.opendevice.c.a, "Lzu4;", "resultCallbacks", "Ltkb;", "Landroid/graphics/Bitmap;", DateTokenConverter.CONVERTER_KEY, "Ltkb;", "imageTransformation", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "imageUrl", "g", "placeholder", Image.TYPE_HIGH, "resultHandler", "getTransform", "transform", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yu4  reason: default package */
/* loaded from: classes.dex */
public final class yu4 {
    private String a;
    private zu4 c;
    private tkb<Bitmap> d;
    private int b = -1;
    private final Function1<String, Unit> e = new a();
    private final Function1<Integer, Unit> f = new b();
    private final Function1<zu4, Unit> g = new c();
    private final Function1<tkb<Bitmap>, Unit> h = new d();

    /* compiled from: ImageLoaderRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yu4$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<String, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            yu4.this.a = str;
        }
    }

    /* compiled from: ImageLoaderRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yu4$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Integer, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            yu4.this.b = i;
        }
    }

    /* compiled from: ImageLoaderRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzu4;", "it", "", "a", "(Lzu4;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yu4$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<zu4, Unit> {
        c() {
            super(1);
        }

        public final void a(zu4 zu4Var) {
            z65.h(zu4Var, "it");
            yu4.this.c = zu4Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(zu4 zu4Var) {
            a(zu4Var);
            return Unit.a;
        }
    }

    /* compiled from: ImageLoaderRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltkb;", "Landroid/graphics/Bitmap;", "it", "", "a", "(Ltkb;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yu4$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<tkb<Bitmap>, Unit> {
        d() {
            super(1);
        }

        public final void a(tkb<Bitmap> tkbVar) {
            z65.h(tkbVar, "it");
            yu4.this.d = tkbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(tkb<Bitmap> tkbVar) {
            a(tkbVar);
            return Unit.a;
        }
    }

    public final xu4 e() {
        String str = this.a;
        zu4 zu4Var = null;
        if (str == null) {
            z65.z(RemoteMessageConst.Notification.URL);
            str = null;
        }
        int i = this.b;
        zu4 zu4Var2 = this.c;
        if (zu4Var2 == null) {
            z65.z("resultCallbacks");
        } else {
            zu4Var = zu4Var2;
        }
        return new xu4(str, i, zu4Var, this.d);
    }

    public final Function1<String, Unit> f() {
        return this.e;
    }

    public final Function1<Integer, Unit> g() {
        return this.f;
    }

    public final Function1<zu4, Unit> h() {
        return this.g;
    }
}
