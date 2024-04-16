package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import defpackage.ik9;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CacheStrategy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u001d\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Lsl0;", "", "Lhi9;", "a", "Lhi9;", "b", "()Lhi9;", "networkRequest", "Lik9;", "Lik9;", "()Lik9;", "cacheResponse", "<init>", "(Lhi9;Lik9;)V", c.a, "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: sl0  reason: default package */
/* loaded from: classes3.dex */
public final class sl0 {
    public static final a c = new a(null);
    private final hi9 a;
    private final ik9 b;

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lsl0$a;", "", "Lik9;", "response", "Lhi9;", "request", "", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sl0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(ik9 ik9Var, hi9 hi9Var) {
            z65.h(ik9Var, "response");
            z65.h(hi9Var, "request");
            int j = ik9Var.j();
            if (j != 200 && j != 410 && j != 414 && j != 501 && j != 203 && j != 204) {
                if (j != 307) {
                    if (j != 308 && j != 404 && j != 405) {
                        switch (j) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (ik9.o(ik9Var, "Expires", null, 2, null) == null && ik9Var.c().e() == -1 && !ik9Var.c().d() && !ik9Var.c().c()) {
                    return false;
                }
            }
            if (ik9Var.c().j() || hi9Var.b().j()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\rR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0018\u0010%\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lsl0$b;", "", "", "f", "Lsl0;", c.a, "", DateTokenConverter.CONVERTER_KEY, "a", "Lhi9;", "request", e.a, "b", "J", "nowMillis", "Lhi9;", "getRequest$okhttp", "()Lhi9;", "Lik9;", "Lik9;", "cacheResponse", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", Image.TYPE_HIGH, "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "<init>", "(JLhi9;Lik9;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sl0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final long a;
        private final hi9 b;
        private final ik9 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public b(long j, hi9 hi9Var, ik9 ik9Var) {
            boolean v;
            boolean v2;
            boolean v3;
            boolean v4;
            boolean v5;
            z65.h(hi9Var, "request");
            this.a = j;
            this.b = hi9Var;
            this.c = ik9Var;
            this.l = -1;
            if (ik9Var != null) {
                this.i = ik9Var.L();
                this.j = ik9Var.H();
                gn4 q = ik9Var.q();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    String h = q.h(i);
                    String u = q.u(i);
                    v = l0b.v(h, "Date", true);
                    if (!v) {
                        v2 = l0b.v(h, "Expires", true);
                        if (!v2) {
                            v3 = l0b.v(h, "Last-Modified", true);
                            if (!v3) {
                                v4 = l0b.v(h, "ETag", true);
                                if (!v4) {
                                    v5 = l0b.v(h, "Age", true);
                                    if (v5) {
                                        this.l = zdc.H(u, -1);
                                    }
                                } else {
                                    this.k = u;
                                }
                            } else {
                                this.f = gn2.a(u);
                                this.g = u;
                            }
                        } else {
                            this.h = gn2.a(u);
                        }
                    } else {
                        this.d = gn2.a(u);
                        this.e = u;
                    }
                }
            }
        }

        private final long a() {
            long j;
            Date date = this.d;
            if (date != null) {
                j = Math.max(0L, this.j - date.getTime());
            } else {
                j = 0;
            }
            int i = this.l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            return j + Math.max(0L, this.j - this.i) + Math.max(0L, this.a - this.j);
        }

        private final sl0 c() {
            long j;
            String str;
            if (this.c == null) {
                return new sl0(this.b, null);
            }
            if (this.b.g() && this.c.m() == null) {
                return new sl0(this.b, null);
            }
            if (!sl0.c.a(this.c, this.b)) {
                return new sl0(this.b, null);
            }
            ll0 b = this.b.b();
            if (!b.i() && !e(this.b)) {
                ll0 c = this.c.c();
                long a = a();
                long d = d();
                if (b.e() != -1) {
                    d = Math.min(d, TimeUnit.SECONDS.toMillis(b.e()));
                }
                long j2 = 0;
                if (b.g() != -1) {
                    j = TimeUnit.SECONDS.toMillis(b.g());
                } else {
                    j = 0;
                }
                if (!c.h() && b.f() != -1) {
                    j2 = TimeUnit.SECONDS.toMillis(b.f());
                }
                if (!c.i()) {
                    long j3 = j + a;
                    if (j3 < j2 + d) {
                        ik9.a u = this.c.u();
                        if (j3 >= d) {
                            u.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a > CoreConstants.MILLIS_IN_ONE_DAY && f()) {
                            u.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new sl0(null, u.c());
                    }
                }
                String str2 = this.k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f != null) {
                        str2 = this.g;
                    } else if (this.d != null) {
                        str2 = this.e;
                    } else {
                        return new sl0(this.b, null);
                    }
                    str = "If-Modified-Since";
                }
                gn4.a p = this.b.e().p();
                z65.e(str2);
                p.d(str, str2);
                return new sl0(this.b.i().k(p.f()).b(), this.c);
            }
            return new sl0(this.b, null);
        }

        private final long d() {
            long j;
            long j2;
            ik9 ik9Var = this.c;
            z65.e(ik9Var);
            ll0 c = ik9Var.c();
            if (c.e() != -1) {
                return TimeUnit.SECONDS.toMillis(c.e());
            }
            Date date = this.h;
            if (date != null) {
                Date date2 = this.d;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.j;
                }
                long time = date.getTime() - j2;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f == null || this.c.K().l().s() != null) {
                return 0L;
            } else {
                Date date3 = this.d;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.i;
                }
                Date date4 = this.f;
                z65.e(date4);
                long time2 = j - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        private final boolean e(hi9 hi9Var) {
            if (hi9Var.d("If-Modified-Since") == null && hi9Var.d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean f() {
            ik9 ik9Var = this.c;
            z65.e(ik9Var);
            if (ik9Var.c().e() == -1 && this.h == null) {
                return true;
            }
            return false;
        }

        public final sl0 b() {
            sl0 c = c();
            if (c.b() != null && this.b.b().l()) {
                return new sl0(null, null);
            }
            return c;
        }
    }

    public sl0(hi9 hi9Var, ik9 ik9Var) {
        this.a = hi9Var;
        this.b = ik9Var;
    }

    public final ik9 a() {
        return this.b;
    }

    public final hi9 b() {
        return this.a;
    }
}
