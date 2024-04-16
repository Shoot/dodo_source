package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Key.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lre5;", "", "", "p", "(J)Ljava/lang/String;", "", "o", "(J)I", "other", "", Image.TYPE_MEDIUM, "(JLjava/lang/Object;)Z", "", "a", "J", "getKeyCode", "()J", "keyCode", "l", "(J)J", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: re5  reason: default package */
/* loaded from: classes.dex */
public final class re5 {
    private final long a;
    public static final a b = new a(null);
    private static final long c = bg5.a(0);
    private static final long d = bg5.a(1);
    private static final long e = bg5.a(2);
    private static final long f = bg5.a(3);
    private static final long g = bg5.a(4);
    private static final long h = bg5.a(259);
    private static final long i = bg5.a(260);
    private static final long j = bg5.a(261);
    private static final long k = bg5.a(262);
    private static final long l = bg5.a(263);
    private static final long m = bg5.a(280);
    private static final long n = bg5.a(281);
    private static final long o = bg5.a(282);
    private static final long p = bg5.a(283);
    private static final long q = bg5.a(5);
    private static final long r = bg5.a(6);
    private static final long s = bg5.a(19);
    private static final long t = bg5.a(20);
    private static final long u = bg5.a(21);
    private static final long v = bg5.a(22);
    private static final long w = bg5.a(23);
    private static final long x = bg5.a(268);
    private static final long y = bg5.a(269);
    private static final long z = bg5.a(270);
    private static final long A = bg5.a(271);
    private static final long B = bg5.a(24);
    private static final long C = bg5.a(25);
    private static final long D = bg5.a(26);
    private static final long E = bg5.a(27);
    private static final long F = bg5.a(28);
    private static final long G = bg5.a(7);
    private static final long H = bg5.a(8);
    private static final long I = bg5.a(9);
    private static final long J = bg5.a(10);
    private static final long K = bg5.a(11);
    private static final long L = bg5.a(12);
    private static final long M = bg5.a(13);
    private static final long N = bg5.a(14);
    private static final long O = bg5.a(15);
    private static final long P = bg5.a(16);
    private static final long Q = bg5.a(81);
    private static final long R = bg5.a(69);
    private static final long S = bg5.a(17);
    private static final long T = bg5.a(70);
    private static final long U = bg5.a(18);
    private static final long V = bg5.a(29);
    private static final long W = bg5.a(30);
    private static final long X = bg5.a(31);
    private static final long Y = bg5.a(32);
    private static final long Z = bg5.a(33);
    private static final long a0 = bg5.a(34);
    private static final long b0 = bg5.a(35);
    private static final long c0 = bg5.a(36);
    private static final long d0 = bg5.a(37);
    private static final long e0 = bg5.a(38);
    private static final long f0 = bg5.a(39);
    private static final long g0 = bg5.a(40);
    private static final long h0 = bg5.a(41);
    private static final long i0 = bg5.a(42);
    private static final long j0 = bg5.a(43);
    private static final long k0 = bg5.a(44);
    private static final long l0 = bg5.a(45);
    private static final long m0 = bg5.a(46);
    private static final long n0 = bg5.a(47);
    private static final long o0 = bg5.a(48);
    private static final long p0 = bg5.a(49);
    private static final long q0 = bg5.a(50);
    private static final long r0 = bg5.a(51);
    private static final long s0 = bg5.a(52);
    private static final long t0 = bg5.a(53);
    private static final long u0 = bg5.a(54);
    private static final long v0 = bg5.a(55);
    private static final long w0 = bg5.a(56);
    private static final long x0 = bg5.a(57);
    private static final long y0 = bg5.a(58);
    private static final long z0 = bg5.a(59);
    private static final long A0 = bg5.a(60);
    private static final long B0 = bg5.a(61);
    private static final long C0 = bg5.a(62);
    private static final long D0 = bg5.a(63);
    private static final long E0 = bg5.a(64);
    private static final long F0 = bg5.a(65);
    private static final long G0 = bg5.a(66);
    private static final long H0 = bg5.a(67);
    private static final long I0 = bg5.a(112);
    private static final long J0 = bg5.a(111);
    private static final long K0 = bg5.a(113);
    private static final long L0 = bg5.a(114);
    private static final long M0 = bg5.a(115);
    private static final long N0 = bg5.a(116);
    private static final long O0 = bg5.a(117);
    private static final long P0 = bg5.a(118);
    private static final long Q0 = bg5.a(119);
    private static final long R0 = bg5.a(120);
    private static final long S0 = bg5.a(121);
    private static final long T0 = bg5.a(122);
    private static final long U0 = bg5.a(123);
    private static final long V0 = bg5.a(124);
    private static final long W0 = bg5.a(277);
    private static final long X0 = bg5.a(278);
    private static final long Y0 = bg5.a(279);
    private static final long Z0 = bg5.a(68);
    private static final long a1 = bg5.a(71);
    private static final long b1 = bg5.a(72);
    private static final long c1 = bg5.a(76);
    private static final long d1 = bg5.a(73);
    private static final long e1 = bg5.a(74);
    private static final long f1 = bg5.a(75);
    private static final long g1 = bg5.a(77);
    private static final long h1 = bg5.a(78);
    private static final long i1 = bg5.a(79);
    private static final long j1 = bg5.a(80);
    private static final long k1 = bg5.a(82);
    private static final long l1 = bg5.a(83);
    private static final long m1 = bg5.a(84);
    private static final long n1 = bg5.a(92);
    private static final long o1 = bg5.a(93);
    private static final long p1 = bg5.a(94);
    private static final long q1 = bg5.a(95);
    private static final long r1 = bg5.a(96);
    private static final long s1 = bg5.a(97);
    private static final long t1 = bg5.a(98);
    private static final long u1 = bg5.a(99);
    private static final long v1 = bg5.a(100);
    private static final long w1 = bg5.a(101);
    private static final long x1 = bg5.a(102);
    private static final long y1 = bg5.a(103);
    private static final long z1 = bg5.a(104);
    private static final long A1 = bg5.a(105);
    private static final long B1 = bg5.a(106);
    private static final long C1 = bg5.a(107);
    private static final long D1 = bg5.a(108);
    private static final long E1 = bg5.a(109);
    private static final long F1 = bg5.a(110);
    private static final long G1 = bg5.a(188);
    private static final long H1 = bg5.a(189);
    private static final long I1 = bg5.a(190);
    private static final long J1 = bg5.a(191);
    private static final long K1 = bg5.a(192);
    private static final long L1 = bg5.a(193);
    private static final long M1 = bg5.a(194);
    private static final long N1 = bg5.a(195);
    private static final long O1 = bg5.a(196);
    private static final long P1 = bg5.a(197);
    private static final long Q1 = bg5.a(198);
    private static final long R1 = bg5.a(199);
    private static final long S1 = bg5.a(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
    private static final long T1 = bg5.a(ChatFragment.REQUEST_PERMISSION_CAMERA);
    private static final long U1 = bg5.a(ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL);
    private static final long V1 = bg5.a(203);
    private static final long W1 = bg5.a(125);
    private static final long X1 = bg5.a(131);
    private static final long Y1 = bg5.a(132);
    private static final long Z1 = bg5.a(133);
    private static final long a2 = bg5.a(134);
    private static final long b2 = bg5.a(135);
    private static final long c2 = bg5.a(SyslogConstants.LOG_LOCAL1);
    private static final long d2 = bg5.a(137);
    private static final long e2 = bg5.a(138);
    private static final long f2 = bg5.a(139);
    private static final long g2 = bg5.a(140);
    private static final long h2 = bg5.a(141);
    private static final long i2 = bg5.a(142);
    private static final long j2 = bg5.a(143);
    private static final long k2 = bg5.a(SyslogConstants.LOG_LOCAL2);
    private static final long l2 = bg5.a(145);
    private static final long m2 = bg5.a(146);
    private static final long n2 = bg5.a(147);
    private static final long o2 = bg5.a(148);
    private static final long p2 = bg5.a(149);
    private static final long q2 = bg5.a(150);
    private static final long r2 = bg5.a(151);
    private static final long s2 = bg5.a(SyslogConstants.LOG_LOCAL3);
    private static final long t2 = bg5.a(153);
    private static final long u2 = bg5.a(154);
    private static final long v2 = bg5.a(155);
    private static final long w2 = bg5.a(156);
    private static final long x2 = bg5.a(157);
    private static final long y2 = bg5.a(158);
    private static final long z2 = bg5.a(159);
    private static final long A2 = bg5.a(SyslogConstants.LOG_LOCAL4);
    private static final long B2 = bg5.a(161);
    private static final long C2 = bg5.a(162);
    private static final long D2 = bg5.a(163);
    private static final long E2 = bg5.a(126);
    private static final long F2 = bg5.a(127);
    private static final long G2 = bg5.a(85);
    private static final long H2 = bg5.a(86);
    private static final long I2 = bg5.a(130);
    private static final long J2 = bg5.a(87);
    private static final long K2 = bg5.a(88);
    private static final long L2 = bg5.a(89);
    private static final long M2 = bg5.a(90);
    private static final long N2 = bg5.a(128);
    private static final long O2 = bg5.a(222);
    private static final long P2 = bg5.a(129);
    private static final long Q2 = bg5.a(226);
    private static final long R2 = bg5.a(272);
    private static final long S2 = bg5.a(273);
    private static final long T2 = bg5.a(274);
    private static final long U2 = bg5.a(275);
    private static final long V2 = bg5.a(91);
    private static final long W2 = bg5.a(164);
    private static final long X2 = bg5.a(165);
    private static final long Y2 = bg5.a(166);
    private static final long Z2 = bg5.a(167);
    private static final long a3 = bg5.a(168);
    private static final long b3 = bg5.a(169);
    private static final long c3 = bg5.a(170);
    private static final long d3 = bg5.a(171);
    private static final long e3 = bg5.a(172);
    private static final long f3 = bg5.a(173);
    private static final long g3 = bg5.a(174);
    private static final long h3 = bg5.a(175);
    private static final long i3 = bg5.a(SyslogConstants.LOG_LOCAL6);
    private static final long j3 = bg5.a(177);
    private static final long k3 = bg5.a(178);
    private static final long l3 = bg5.a(179);
    private static final long m3 = bg5.a(180);
    private static final long n3 = bg5.a(181);
    private static final long o3 = bg5.a(182);
    private static final long p3 = bg5.a(183);
    private static final long q3 = bg5.a(SyslogConstants.LOG_LOCAL7);
    private static final long r3 = bg5.a(185);
    private static final long s3 = bg5.a(186);
    private static final long t3 = bg5.a(187);
    private static final long u3 = bg5.a(ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO);
    private static final long v3 = bg5.a(205);
    private static final long w3 = bg5.a(206);
    private static final long x3 = bg5.a(207);
    private static final long y3 = bg5.a(208);
    private static final long z3 = bg5.a(209);
    private static final long A3 = bg5.a(210);
    private static final long B3 = bg5.a(211);
    private static final long C3 = bg5.a(212);
    private static final long D3 = bg5.a(213);
    private static final long E3 = bg5.a(214);
    private static final long F3 = bg5.a(215);
    private static final long G3 = bg5.a(216);
    private static final long H3 = bg5.a(217);
    private static final long I3 = bg5.a(218);
    private static final long J3 = bg5.a(219);
    private static final long K3 = bg5.a(220);
    private static final long L3 = bg5.a(221);
    private static final long M3 = bg5.a(223);
    private static final long N3 = bg5.a(224);
    private static final long O3 = bg5.a(276);
    private static final long P3 = bg5.a(225);
    private static final long Q3 = bg5.a(229);
    private static final long R3 = bg5.a(230);
    private static final long S3 = bg5.a(231);
    private static final long T3 = bg5.a(232);
    private static final long U3 = bg5.a(233);
    private static final long V3 = bg5.a(234);
    private static final long W3 = bg5.a(235);
    private static final long X3 = bg5.a(236);
    private static final long Y3 = bg5.a(237);
    private static final long Z3 = bg5.a(238);
    private static final long a4 = bg5.a(239);
    private static final long b4 = bg5.a(240);
    private static final long c4 = bg5.a(241);
    private static final long d4 = bg5.a(242);
    private static final long e4 = bg5.a(243);
    private static final long f4 = bg5.a(244);
    private static final long g4 = bg5.a(245);
    private static final long h4 = bg5.a(246);
    private static final long i4 = bg5.a(247);
    private static final long j4 = bg5.a(248);
    private static final long k4 = bg5.a(249);
    private static final long l4 = bg5.a(250);
    private static final long m4 = bg5.a(251);
    private static final long n4 = bg5.a(252);
    private static final long o4 = bg5.a(253);
    private static final long p4 = bg5.a(254);
    private static final long q4 = bg5.a(255);
    private static final long r4 = bg5.a(256);
    private static final long s4 = bg5.a(257);
    private static final long t4 = bg5.a(258);
    private static final long u4 = bg5.a(264);
    private static final long v4 = bg5.a(265);
    private static final long w4 = bg5.a(266);
    private static final long x4 = bg5.a(267);
    private static final long y4 = bg5.a(284);
    private static final long z4 = bg5.a(285);
    private static final long A4 = bg5.a(286);
    private static final long B4 = bg5.a(287);
    private static final long C4 = bg5.a(288);

    /* compiled from: Key.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lre5$a;", "", "Lre5;", "Back", "J", "a", "()J", "DirectionUp", "f", "DirectionDown", c.a, "DirectionLeft", DateTokenConverter.CONVERTER_KEY, "DirectionRight", e.a, "DirectionCenter", "b", "Tab", "j", "Enter", "g", "Escape", Image.TYPE_HIGH, "NumPadEnter", "i", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: re5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return re5.g;
        }

        public final long b() {
            return re5.w;
        }

        public final long c() {
            return re5.t;
        }

        public final long d() {
            return re5.u;
        }

        public final long e() {
            return re5.v;
        }

        public final long f() {
            return re5.s;
        }

        public final long g() {
            return re5.G0;
        }

        public final long h() {
            return re5.J0;
        }

        public final long i() {
            return re5.A2;
        }

        public final long j() {
            return re5.B0;
        }
    }

    private /* synthetic */ re5(long j5) {
        this.a = j5;
    }

    public static final /* synthetic */ re5 k(long j5) {
        return new re5(j5);
    }

    public static boolean m(long j5, Object obj) {
        if (!(obj instanceof re5) || j5 != ((re5) obj).q()) {
            return false;
        }
        return true;
    }

    public static final boolean n(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static int o(long j5) {
        return ax1.a(j5);
    }

    public static String p(long j5) {
        return "Key code: " + j5;
    }

    public boolean equals(Object obj) {
        return m(this.a, obj);
    }

    public int hashCode() {
        return o(this.a);
    }

    public final /* synthetic */ long q() {
        return this.a;
    }

    public String toString() {
        return p(this.a);
    }

    public static long l(long j5) {
        return j5;
    }
}
