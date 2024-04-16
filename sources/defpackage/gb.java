package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ab0;
import kotlin.Metadata;
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\b\n\u000bJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lgb;", "", "Lw55;", "size", "space", "Lqm5;", "layoutDirection", "Ls55;", "a", "(JJLqm5;)J", "b", com.huawei.hms.opendevice.c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public interface gb {
    public static final a a = a.a;

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bC\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u0012\u0004\b\u001b\u0010\b\u001a\u0004\b\u001a\u0010\u0006R \u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b\u001e\u0010\u0006R \u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0004\u0012\u0004\b'\u0010\b\u001a\u0004\b&\u0010\u0006R \u0010.\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010\b\u001a\u0004\b\u0012\u0010,R \u00101\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b0\u0010\b\u001a\u0004\b\n\u0010,R \u00105\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010+\u0012\u0004\b4\u0010\b\u001a\u0004\b3\u0010,R \u0010;\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010\b\u001a\u0004\b\u000e\u00109R \u0010>\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00108\u0012\u0004\b=\u0010\b\u001a\u0004\b\u0003\u00109R \u0010B\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00108\u0012\u0004\bA\u0010\b\u001a\u0004\b@\u00109¨\u0006D"}, d2 = {"Lgb$a;", "", "Lgb;", "b", "Lgb;", "f", "()Lgb;", "getTopStart$annotations", "()V", "TopStart", com.huawei.hms.opendevice.c.a, "getTopCenter", "getTopCenter$annotations", "TopCenter", DateTokenConverter.CONVERTER_KEY, "getTopEnd", "getTopEnd$annotations", "TopEnd", e.a, "getCenterStart", "getCenterStart$annotations", "CenterStart", "a", "getCenter$annotations", "Center", "g", "getCenterEnd", "getCenterEnd$annotations", "CenterEnd", Image.TYPE_HIGH, "getBottomStart", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd", "getBottomEnd$annotations", "BottomEnd", "Lgb$c;", "k", "Lgb$c;", "()Lgb$c;", "getTop$annotations", "Top", "l", "getCenterVertically$annotations", "CenterVertically", Image.TYPE_MEDIUM, "getBottom", "getBottom$annotations", "Bottom", "Lgb$b;", "n", "Lgb$b;", "()Lgb$b;", "getStart$annotations", "Start", "o", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd", "getEnd$annotations", "End", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gb$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final gb b = new ab0(-1.0f, -1.0f);
        private static final gb c = new ab0(0.0f, -1.0f);
        private static final gb d = new ab0(1.0f, -1.0f);
        private static final gb e = new ab0(-1.0f, 0.0f);
        private static final gb f = new ab0(0.0f, 0.0f);
        private static final gb g = new ab0(1.0f, 0.0f);
        private static final gb h = new ab0(-1.0f, 1.0f);
        private static final gb i = new ab0(0.0f, 1.0f);
        private static final gb j = new ab0(1.0f, 1.0f);
        private static final c k = new ab0.b(-1.0f);
        private static final c l = new ab0.b(0.0f);
        private static final c m = new ab0.b(1.0f);
        private static final b n = new ab0.a(-1.0f);
        private static final b o = new ab0.a(0.0f);
        private static final b p = new ab0.a(1.0f);

        private a() {
        }

        public final gb a() {
            return f;
        }

        public final b b() {
            return o;
        }

        public final c c() {
            return l;
        }

        public final b d() {
            return n;
        }

        public final c e() {
            return k;
        }

        public final gb f() {
            return b;
        }
    }

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lgb$b;", "", "", "size", "space", "Lqm5;", "layoutDirection", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gb$b */
    /* loaded from: classes.dex */
    public interface b {
        int a(int i, int i2, qm5 qm5Var);
    }

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lgb$c;", "", "", "size", "space", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gb$c */
    /* loaded from: classes.dex */
    public interface c {
        int a(int i, int i2);
    }

    long a(long j, long j2, qm5 qm5Var);
}
