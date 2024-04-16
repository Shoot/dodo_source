package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.kib;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokeniserState.java */
/* renamed from: uib  reason: default package */
/* loaded from: classes3.dex */
public abstract class uib {
    public static final uib a = new k("Data", 0);
    public static final uib b = new uib("CharacterReferenceInData", 1) { // from class: uib.v
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.G(tibVar, uib.a);
        }
    };
    public static final uib c = new uib("Rcdata", 2) { // from class: uib.g0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v2 = lw0Var.v();
            if (v2 != 0) {
                if (v2 != '&') {
                    if (v2 != '<') {
                        if (v2 != 65535) {
                            tibVar.m(lw0Var.i());
                            return;
                        } else {
                            tibVar.l(new kib.f());
                            return;
                        }
                    }
                    tibVar.a(uib.k);
                    return;
                }
                tibVar.a(uib.d);
                return;
            }
            tibVar.t(this);
            lw0Var.a();
            tibVar.k((char) 65533);
        }
    };
    public static final uib d = new uib("CharacterReferenceInRcdata", 3) { // from class: uib.r0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.G(tibVar, uib.c);
        }
    };
    public static final uib e = new uib("Rawtext", 4) { // from class: uib.c1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.K(tibVar, lw0Var, this, uib.n);
        }
    };
    public static final uib f = new uib("ScriptData", 5) { // from class: uib.l1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.K(tibVar, lw0Var, this, uib.q);
        }
    };
    public static final uib g = new uib("PLAINTEXT", 6) { // from class: uib.m1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v2 = lw0Var.v();
            if (v2 != 0) {
                if (v2 != 65535) {
                    tibVar.m(lw0Var.p((char) 0));
                    return;
                } else {
                    tibVar.l(new kib.f());
                    return;
                }
            }
            tibVar.t(this);
            lw0Var.a();
            tibVar.k((char) 65533);
        }
    };
    public static final uib h = new uib("TagOpen", 7) { // from class: uib.n1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v2 = lw0Var.v();
            if (v2 != '!') {
                if (v2 != '/') {
                    if (v2 != '?') {
                        if (lw0Var.K()) {
                            tibVar.i(true);
                            tibVar.x(uib.j);
                            return;
                        }
                        tibVar.t(this);
                        tibVar.k('<');
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.f();
                    tibVar.x(uib.c5);
                    return;
                }
                tibVar.a(uib.i);
                return;
            }
            tibVar.a(uib.d5);
        }
    };
    public static final uib i = new uib("EndTagOpen", 8) { // from class: uib.o1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.x()) {
                tibVar.s(this);
                tibVar.m("</");
                tibVar.x(uib.a);
            } else if (lw0Var.K()) {
                tibVar.i(false);
                tibVar.x(uib.j);
            } else if (lw0Var.G('>')) {
                tibVar.t(this);
                tibVar.a(uib.a);
            } else {
                tibVar.t(this);
                tibVar.f();
                tibVar.n.t('/');
                tibVar.x(uib.c5);
            }
        }
    };
    public static final uib j = new uib("TagName", 9) { // from class: uib.a
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            tibVar.k.z(lw0Var.o());
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '/') {
                        if (g2 != '<') {
                            if (g2 != '>') {
                                if (g2 != 65535) {
                                    if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                        tibVar.k.y(g2);
                                        return;
                                    }
                                } else {
                                    tibVar.s(this);
                                    tibVar.x(uib.a);
                                    return;
                                }
                            }
                        } else {
                            lw0Var.V();
                            tibVar.t(this);
                        }
                        tibVar.r();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.x(uib.b5);
                    return;
                }
                tibVar.x(uib.T4);
                return;
            }
            tibVar.k.z(uib.D5);
        }
    };
    public static final uib k = new uib("RcdataLessthanSign", 10) { // from class: uib.b
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.G('/')) {
                tibVar.j();
                tibVar.a(uib.l);
            } else if (lw0Var.K() && tibVar.b() != null && !lw0Var.u(tibVar.c())) {
                tibVar.k = tibVar.i(false).G(tibVar.b());
                tibVar.r();
                tibVar.x(uib.h);
            } else {
                tibVar.m("<");
                tibVar.x(uib.c);
            }
        }
    };
    public static final uib l = new uib("RCDATAEndTagOpen", 11) { // from class: uib.c
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.K()) {
                tibVar.i(false);
                tibVar.k.y(lw0Var.v());
                tibVar.h.append(lw0Var.v());
                tibVar.a(uib.m);
                return;
            }
            tibVar.m("</");
            tibVar.x(uib.c);
        }
    };
    public static final uib m = new uib("RCDATAEndTagName", 12) { // from class: uib.d
        private void L(tib tibVar, lw0 lw0Var) {
            tibVar.m("</");
            tibVar.n(tibVar.h);
            lw0Var.V();
            tibVar.x(uib.c);
        }

        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.K()) {
                String l2 = lw0Var.l();
                tibVar.k.z(l2);
                tibVar.h.append(l2);
                return;
            }
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '/') {
                    if (g2 != '>') {
                        L(tibVar, lw0Var);
                    } else if (tibVar.v()) {
                        tibVar.r();
                        tibVar.x(uib.a);
                    } else {
                        L(tibVar, lw0Var);
                    }
                } else if (tibVar.v()) {
                    tibVar.x(uib.b5);
                } else {
                    L(tibVar, lw0Var);
                }
            } else if (tibVar.v()) {
                tibVar.x(uib.T4);
            } else {
                L(tibVar, lw0Var);
            }
        }
    };
    public static final uib n = new uib("RawtextLessthanSign", 13) { // from class: uib.e
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.G('/')) {
                tibVar.j();
                tibVar.a(uib.o);
                return;
            }
            tibVar.k('<');
            tibVar.x(uib.e);
        }
    };
    public static final uib o = new uib("RawtextEndTagOpen", 14) { // from class: uib.f
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.H(tibVar, lw0Var, uib.p, uib.e);
        }
    };
    public static final uib p = new uib("RawtextEndTagName", 15) { // from class: uib.g
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.x(tibVar, lw0Var, uib.e);
        }
    };
    public static final uib q = new uib("ScriptDataLessthanSign", 16) { // from class: uib.h
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '!') {
                if (g2 != '/') {
                    if (g2 != 65535) {
                        tibVar.m("<");
                        lw0Var.V();
                        tibVar.x(uib.f);
                        return;
                    }
                    tibVar.m("<");
                    tibVar.s(this);
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.j();
                tibVar.x(uib.r);
                return;
            }
            tibVar.m("<!");
            tibVar.x(uib.t);
        }
    };
    public static final uib r = new uib("ScriptDataEndTagOpen", 17) { // from class: uib.i
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.H(tibVar, lw0Var, uib.s, uib.f);
        }
    };
    public static final uib s = new uib("ScriptDataEndTagName", 18) { // from class: uib.j
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.x(tibVar, lw0Var, uib.f);
        }
    };
    public static final uib t = new uib("ScriptDataEscapeStart", 19) { // from class: uib.l
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.G(CoreConstants.DASH_CHAR)) {
                tibVar.k(CoreConstants.DASH_CHAR);
                tibVar.a(uib.u);
                return;
            }
            tibVar.x(uib.f);
        }
    };
    public static final uib u = new uib("ScriptDataEscapeStartDash", 20) { // from class: uib.m
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.G(CoreConstants.DASH_CHAR)) {
                tibVar.k(CoreConstants.DASH_CHAR);
                tibVar.a(uib.x);
                return;
            }
            tibVar.x(uib.f);
        }
    };
    public static final uib v = new uib("ScriptDataEscaped", 21) { // from class: uib.n
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.x()) {
                tibVar.s(this);
                tibVar.x(uib.a);
                return;
            }
            char v2 = lw0Var.v();
            if (v2 != 0) {
                if (v2 != '-') {
                    if (v2 != '<') {
                        tibVar.m(lw0Var.r(CoreConstants.DASH_CHAR, '<', 0));
                        return;
                    } else {
                        tibVar.a(uib.y);
                        return;
                    }
                }
                tibVar.k(CoreConstants.DASH_CHAR);
                tibVar.a(uib.w);
                return;
            }
            tibVar.t(this);
            lw0Var.a();
            tibVar.k((char) 65533);
        }
    };
    public static final uib w = new uib("ScriptDataEscapedDash", 22) { // from class: uib.o
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.x()) {
                tibVar.s(this);
                tibVar.x(uib.a);
                return;
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '<') {
                        tibVar.k(g2);
                        tibVar.x(uib.v);
                        return;
                    }
                    tibVar.x(uib.y);
                    return;
                }
                tibVar.k(g2);
                tibVar.x(uib.x);
                return;
            }
            tibVar.t(this);
            tibVar.k((char) 65533);
            tibVar.x(uib.v);
        }
    };
    public static final uib x = new uib("ScriptDataEscapedDashDash", 23) { // from class: uib.p
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.x()) {
                tibVar.s(this);
                tibVar.x(uib.a);
                return;
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '<') {
                        if (g2 != '>') {
                            tibVar.k(g2);
                            tibVar.x(uib.v);
                            return;
                        }
                        tibVar.k(g2);
                        tibVar.x(uib.f);
                        return;
                    }
                    tibVar.x(uib.y);
                    return;
                }
                tibVar.k(g2);
                return;
            }
            tibVar.t(this);
            tibVar.k((char) 65533);
            tibVar.x(uib.v);
        }
    };
    public static final uib y = new uib("ScriptDataEscapedLessthanSign", 24) { // from class: uib.q
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.K()) {
                tibVar.j();
                tibVar.h.append(lw0Var.v());
                tibVar.m("<");
                tibVar.k(lw0Var.v());
                tibVar.a(uib.B);
            } else if (lw0Var.G('/')) {
                tibVar.j();
                tibVar.a(uib.z);
            } else {
                tibVar.k('<');
                tibVar.x(uib.v);
            }
        }
    };
    public static final uib z = new uib("ScriptDataEscapedEndTagOpen", 25) { // from class: uib.r
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.K()) {
                tibVar.i(false);
                tibVar.k.y(lw0Var.v());
                tibVar.h.append(lw0Var.v());
                tibVar.a(uib.A);
                return;
            }
            tibVar.m("</");
            tibVar.x(uib.v);
        }
    };
    public static final uib A = new uib("ScriptDataEscapedEndTagName", 26) { // from class: uib.s
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.x(tibVar, lw0Var, uib.v);
        }
    };
    public static final uib B = new uib("ScriptDataDoubleEscapeStart", 27) { // from class: uib.t
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.w(tibVar, lw0Var, uib.I, uib.v);
        }
    };
    public static final uib I = new uib("ScriptDataDoubleEscaped", 28) { // from class: uib.u
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v2 = lw0Var.v();
            if (v2 != 0) {
                if (v2 != '-') {
                    if (v2 != '<') {
                        if (v2 != 65535) {
                            tibVar.m(lw0Var.r(CoreConstants.DASH_CHAR, '<', 0));
                            return;
                        }
                        tibVar.s(this);
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.k(v2);
                    tibVar.a(uib.Z);
                    return;
                }
                tibVar.k(v2);
                tibVar.a(uib.X);
                return;
            }
            tibVar.t(this);
            lw0Var.a();
            tibVar.k((char) 65533);
        }
    };
    public static final uib X = new uib("ScriptDataDoubleEscapedDash", 29) { // from class: uib.w
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '<') {
                        if (g2 != 65535) {
                            tibVar.k(g2);
                            tibVar.x(uib.I);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.k(g2);
                    tibVar.x(uib.Z);
                    return;
                }
                tibVar.k(g2);
                tibVar.x(uib.Y);
                return;
            }
            tibVar.t(this);
            tibVar.k((char) 65533);
            tibVar.x(uib.I);
        }
    };
    public static final uib Y = new uib("ScriptDataDoubleEscapedDashDash", 30) { // from class: uib.x
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '<') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.k(g2);
                                tibVar.x(uib.I);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.k(g2);
                        tibVar.x(uib.f);
                        return;
                    }
                    tibVar.k(g2);
                    tibVar.x(uib.Z);
                    return;
                }
                tibVar.k(g2);
                return;
            }
            tibVar.t(this);
            tibVar.k((char) 65533);
            tibVar.x(uib.I);
        }
    };
    public static final uib Z = new uib("ScriptDataDoubleEscapedLessthanSign", 31) { // from class: uib.y
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.G('/')) {
                tibVar.k('/');
                tibVar.j();
                tibVar.a(uib.S4);
                return;
            }
            tibVar.x(uib.I);
        }
    };
    public static final uib S4 = new uib("ScriptDataDoubleEscapeEnd", 32) { // from class: uib.z
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            uib.w(tibVar, lw0Var, uib.v, uib.I);
        }
    };
    public static final uib T4 = new uib("BeforeAttributeName", 33) { // from class: uib.a0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '\"' && g2 != '\'') {
                        if (g2 != '/') {
                            if (g2 != 65535) {
                                if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                    switch (g2) {
                                        case '<':
                                            lw0Var.V();
                                            tibVar.t(this);
                                            tibVar.r();
                                            tibVar.x(uib.a);
                                            return;
                                        case '=':
                                            break;
                                        case '>':
                                            tibVar.r();
                                            tibVar.x(uib.a);
                                            return;
                                        default:
                                            tibVar.k.I();
                                            lw0Var.V();
                                            tibVar.x(uib.U4);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tibVar.s(this);
                                tibVar.x(uib.a);
                                return;
                            }
                        } else {
                            tibVar.x(uib.b5);
                            return;
                        }
                    }
                    tibVar.t(this);
                    tibVar.k.I();
                    tibVar.k.t(g2);
                    tibVar.x(uib.U4);
                    return;
                }
                return;
            }
            lw0Var.V();
            tibVar.t(this);
            tibVar.k.I();
            tibVar.x(uib.U4);
        }
    };
    public static final uib U4 = new uib("AttributeName", 34) { // from class: uib.b0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            tibVar.k.u(lw0Var.s(uib.B5));
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"' && g2 != '\'') {
                    if (g2 != '/') {
                        if (g2 != 65535) {
                            switch (g2) {
                                case '<':
                                    break;
                                case '=':
                                    tibVar.x(uib.W4);
                                    return;
                                case '>':
                                    tibVar.r();
                                    tibVar.x(uib.a);
                                    return;
                                default:
                                    tibVar.k.t(g2);
                                    return;
                            }
                        } else {
                            tibVar.s(this);
                            tibVar.x(uib.a);
                            return;
                        }
                    } else {
                        tibVar.x(uib.b5);
                        return;
                    }
                }
                tibVar.t(this);
                tibVar.k.t(g2);
                return;
            }
            tibVar.x(uib.V4);
        }
    };
    public static final uib V4 = new uib("AfterAttributeName", 35) { // from class: uib.c0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '\"' && g2 != '\'') {
                        if (g2 != '/') {
                            if (g2 != 65535) {
                                if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                    switch (g2) {
                                        case '<':
                                            break;
                                        case '=':
                                            tibVar.x(uib.W4);
                                            return;
                                        case '>':
                                            tibVar.r();
                                            tibVar.x(uib.a);
                                            return;
                                        default:
                                            tibVar.k.I();
                                            lw0Var.V();
                                            tibVar.x(uib.U4);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tibVar.s(this);
                                tibVar.x(uib.a);
                                return;
                            }
                        } else {
                            tibVar.x(uib.b5);
                            return;
                        }
                    }
                    tibVar.t(this);
                    tibVar.k.I();
                    tibVar.k.t(g2);
                    tibVar.x(uib.U4);
                    return;
                }
                return;
            }
            tibVar.t(this);
            tibVar.k.t((char) 65533);
            tibVar.x(uib.U4);
        }
    };
    public static final uib W4 = new uib("BeforeAttributeValue", 36) { // from class: uib.d0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '\"') {
                        if (g2 != '`') {
                            if (g2 != 65535) {
                                if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                    if (g2 != '&') {
                                        if (g2 != '\'') {
                                            switch (g2) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    tibVar.t(this);
                                                    tibVar.r();
                                                    tibVar.x(uib.a);
                                                    return;
                                                default:
                                                    lw0Var.V();
                                                    tibVar.x(uib.Z4);
                                                    return;
                                            }
                                        } else {
                                            tibVar.x(uib.Y4);
                                            return;
                                        }
                                    } else {
                                        lw0Var.V();
                                        tibVar.x(uib.Z4);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tibVar.s(this);
                                tibVar.r();
                                tibVar.x(uib.a);
                                return;
                            }
                        }
                        tibVar.t(this);
                        tibVar.k.v(g2);
                        tibVar.x(uib.Z4);
                        return;
                    }
                    tibVar.x(uib.X4);
                    return;
                }
                return;
            }
            tibVar.t(this);
            tibVar.k.v((char) 65533);
            tibVar.x(uib.Z4);
        }
    };
    public static final uib X4 = new uib("AttributeValue_doubleQuoted", 37) { // from class: uib.e0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            String h2 = lw0Var.h(false);
            if (h2.length() > 0) {
                tibVar.k.w(h2);
            } else {
                tibVar.k.L();
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '\"') {
                    if (g2 != '&') {
                        if (g2 != 65535) {
                            tibVar.k.v(g2);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.x(uib.a);
                        return;
                    }
                    int[] e2 = tibVar.e(Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR), true);
                    if (e2 != null) {
                        tibVar.k.x(e2);
                        return;
                    } else {
                        tibVar.k.v('&');
                        return;
                    }
                }
                tibVar.x(uib.a5);
                return;
            }
            tibVar.t(this);
            tibVar.k.v((char) 65533);
        }
    };
    public static final uib Y4 = new uib("AttributeValue_singleQuoted", 38) { // from class: uib.f0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            String h2 = lw0Var.h(true);
            if (h2.length() > 0) {
                tibVar.k.w(h2);
            } else {
                tibVar.k.L();
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != 65535) {
                    if (g2 != '&') {
                        if (g2 != '\'') {
                            tibVar.k.v(g2);
                            return;
                        } else {
                            tibVar.x(uib.a5);
                            return;
                        }
                    }
                    int[] e2 = tibVar.e(Character.valueOf(CoreConstants.SINGLE_QUOTE_CHAR), true);
                    if (e2 != null) {
                        tibVar.k.x(e2);
                        return;
                    } else {
                        tibVar.k.v('&');
                        return;
                    }
                }
                tibVar.s(this);
                tibVar.x(uib.a);
                return;
            }
            tibVar.t(this);
            tibVar.k.v((char) 65533);
        }
    };
    public static final uib Z4 = new uib("AttributeValue_unquoted", 39) { // from class: uib.h0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            String s2 = lw0Var.s(uib.C5);
            if (s2.length() > 0) {
                tibVar.k.w(s2);
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '\"' && g2 != '`') {
                        if (g2 != 65535) {
                            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                if (g2 != '&') {
                                    if (g2 != '\'') {
                                        switch (g2) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                tibVar.r();
                                                tibVar.x(uib.a);
                                                return;
                                            default:
                                                tibVar.k.v(g2);
                                                return;
                                        }
                                    }
                                } else {
                                    int[] e2 = tibVar.e('>', true);
                                    if (e2 != null) {
                                        tibVar.k.x(e2);
                                        return;
                                    } else {
                                        tibVar.k.v('&');
                                        return;
                                    }
                                }
                            }
                        } else {
                            tibVar.s(this);
                            tibVar.x(uib.a);
                            return;
                        }
                    }
                    tibVar.t(this);
                    tibVar.k.v(g2);
                    return;
                }
                tibVar.x(uib.T4);
                return;
            }
            tibVar.t(this);
            tibVar.k.v((char) 65533);
        }
    };
    public static final uib a5 = new uib("AfterAttributeValue_quoted", 40) { // from class: uib.i0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '/') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            lw0Var.V();
                            tibVar.t(this);
                            tibVar.x(uib.T4);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.r();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.b5);
                return;
            }
            tibVar.x(uib.T4);
        }
    };
    public static final uib b5 = new uib("SelfClosingStartTag", 41) { // from class: uib.j0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '>') {
                if (g2 != 65535) {
                    lw0Var.V();
                    tibVar.t(this);
                    tibVar.x(uib.T4);
                    return;
                }
                tibVar.s(this);
                tibVar.x(uib.a);
                return;
            }
            tibVar.k.m = true;
            tibVar.r();
            tibVar.x(uib.a);
        }
    };
    public static final uib c5 = new uib("BogusComment", 42) { // from class: uib.k0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            tibVar.n.u(lw0Var.p('>'));
            char v2 = lw0Var.v();
            if (v2 == '>' || v2 == 65535) {
                lw0Var.g();
                tibVar.p();
                tibVar.x(uib.a);
            }
        }
    };
    public static final uib d5 = new uib("MarkupDeclarationOpen", 43) { // from class: uib.l0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.E("--")) {
                tibVar.g();
                tibVar.x(uib.e5);
            } else if (lw0Var.F("DOCTYPE")) {
                tibVar.x(uib.k5);
            } else if (lw0Var.E("[CDATA[")) {
                tibVar.j();
                tibVar.x(uib.A5);
            } else {
                tibVar.t(this);
                tibVar.f();
                tibVar.x(uib.c5);
            }
        }
    };
    public static final uib e5 = new uib("CommentStart", 44) { // from class: uib.m0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            lw0Var.V();
                            tibVar.x(uib.g5);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.p();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.p();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.f5);
                return;
            }
            tibVar.t(this);
            tibVar.n.t((char) 65533);
            tibVar.x(uib.g5);
        }
    };
    public static final uib f5 = new uib("CommentStartDash", 45) { // from class: uib.n0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.n.t(g2);
                            tibVar.x(uib.g5);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.p();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.p();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.i5);
                return;
            }
            tibVar.t(this);
            tibVar.n.t((char) 65533);
            tibVar.x(uib.g5);
        }
    };
    public static final uib g5 = new uib("Comment", 46) { // from class: uib.o0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v2 = lw0Var.v();
            if (v2 != 0) {
                if (v2 != '-') {
                    if (v2 != 65535) {
                        tibVar.n.u(lw0Var.r(CoreConstants.DASH_CHAR, 0));
                        return;
                    }
                    tibVar.s(this);
                    tibVar.p();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.a(uib.h5);
                return;
            }
            tibVar.t(this);
            lw0Var.a();
            tibVar.n.t((char) 65533);
        }
    };
    public static final uib h5 = new uib("CommentEndDash", 47) { // from class: uib.p0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != 65535) {
                        tibVar.n.t(CoreConstants.DASH_CHAR).t(g2);
                        tibVar.x(uib.g5);
                        return;
                    }
                    tibVar.s(this);
                    tibVar.p();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.i5);
                return;
            }
            tibVar.t(this);
            tibVar.n.t(CoreConstants.DASH_CHAR).t((char) 65533);
            tibVar.x(uib.g5);
        }
    };
    public static final uib i5 = new uib("CommentEnd", 48) { // from class: uib.q0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '!') {
                    if (g2 != '-') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.n.u("--").t(g2);
                                tibVar.x(uib.g5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.p();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.p();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.n.t(CoreConstants.DASH_CHAR);
                    return;
                }
                tibVar.x(uib.j5);
                return;
            }
            tibVar.t(this);
            tibVar.n.u("--").t((char) 65533);
            tibVar.x(uib.g5);
        }
    };
    public static final uib j5 = new uib("CommentEndBang", 49) { // from class: uib.s0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '-') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.n.u("--!").t(g2);
                            tibVar.x(uib.g5);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.p();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.p();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.n.u("--!");
                tibVar.x(uib.h5);
                return;
            }
            tibVar.t(this);
            tibVar.n.u("--!").t((char) 65533);
            tibVar.x(uib.g5);
        }
    };
    public static final uib k5 = new uib("Doctype", 50) { // from class: uib.t0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '>') {
                    if (g2 != 65535) {
                        tibVar.t(this);
                        tibVar.x(uib.l5);
                        return;
                    }
                    tibVar.s(this);
                }
                tibVar.t(this);
                tibVar.h();
                tibVar.m.h = true;
                tibVar.q();
                tibVar.x(uib.a);
                return;
            }
            tibVar.x(uib.l5);
        }
    };
    public static final uib l5 = new uib("BeforeDoctypeName", 51) { // from class: uib.u0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.K()) {
                tibVar.h();
                tibVar.x(uib.m5);
                return;
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != 65535) {
                        if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                            tibVar.h();
                            tibVar.m.d.append(g2);
                            tibVar.x(uib.m5);
                            return;
                        }
                        return;
                    }
                    tibVar.s(this);
                    tibVar.h();
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                return;
            }
            tibVar.t(this);
            tibVar.h();
            tibVar.m.d.append((char) 65533);
            tibVar.x(uib.m5);
        }
    };
    public static final uib m5 = new uib("DoctypeName", 52) { // from class: uib.v0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.N()) {
                tibVar.m.d.append(lw0Var.l());
                return;
            }
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != ' ') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r') {
                                tibVar.m.d.append(g2);
                                return;
                            }
                        } else {
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                    } else {
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                }
                tibVar.x(uib.n5);
                return;
            }
            tibVar.t(this);
            tibVar.m.d.append((char) 65533);
        }
    };
    public static final uib n5 = new uib("AfterDoctypeName", 53) { // from class: uib.w0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            if (lw0Var.x()) {
                tibVar.s(this);
                tibVar.m.h = true;
                tibVar.q();
                tibVar.x(uib.a);
            } else if (lw0Var.I('\t', '\n', '\r', '\f', ' ')) {
                lw0Var.a();
            } else if (lw0Var.G('>')) {
                tibVar.q();
                tibVar.a(uib.a);
            } else if (lw0Var.F("PUBLIC")) {
                tibVar.m.e = "PUBLIC";
                tibVar.x(uib.o5);
            } else if (lw0Var.F("SYSTEM")) {
                tibVar.m.e = "SYSTEM";
                tibVar.x(uib.u5);
            } else {
                tibVar.t(this);
                tibVar.m.h = true;
                tibVar.a(uib.z5);
            }
        }
    };
    public static final uib o5 = new uib("AfterDoctypePublicKeyword", 54) { // from class: uib.x0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.x(uib.z5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.t(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.x(uib.r5);
                    return;
                }
                tibVar.t(this);
                tibVar.x(uib.q5);
                return;
            }
            tibVar.x(uib.p5);
        }
    };
    public static final uib p5 = new uib("BeforeDoctypePublicIdentifier", 55) { // from class: uib.y0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.x(uib.z5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.t(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.x(uib.r5);
                    return;
                }
                tibVar.x(uib.q5);
            }
        }
    };
    public static final uib q5 = new uib("DoctypePublicIdentifier_doubleQuoted", 56) { // from class: uib.z0
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '\"') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.m.f.append(g2);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.s5);
                return;
            }
            tibVar.t(this);
            tibVar.m.f.append((char) 65533);
        }
    };
    public static final uib r5 = new uib("DoctypePublicIdentifier_singleQuoted", 57) { // from class: uib.a1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '\'') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.m.f.append(g2);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.s5);
                return;
            }
            tibVar.t(this);
            tibVar.m.f.append((char) 65533);
        }
    };
    public static final uib s5 = new uib("AfterDoctypePublicIdentifier", 58) { // from class: uib.b1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.x(uib.z5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.x(uib.x5);
                    return;
                }
                tibVar.t(this);
                tibVar.x(uib.w5);
                return;
            }
            tibVar.x(uib.t5);
        }
    };
    public static final uib t5 = new uib("BetweenDoctypePublicAndSystemIdentifiers", 59) { // from class: uib.d1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.x(uib.z5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.x(uib.x5);
                    return;
                }
                tibVar.t(this);
                tibVar.x(uib.w5);
            }
        }
    };
    public static final uib u5 = new uib("AfterDoctypeSystemKeyword", 60) { // from class: uib.e1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.q();
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.t(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.x(uib.x5);
                    return;
                }
                tibVar.t(this);
                tibVar.x(uib.w5);
                return;
            }
            tibVar.x(uib.v5);
        }
    };
    public static final uib v5 = new uib("BeforeDoctypeSystemIdentifier", 61) { // from class: uib.f1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '\"') {
                    if (g2 != '\'') {
                        if (g2 != '>') {
                            if (g2 != 65535) {
                                tibVar.t(this);
                                tibVar.m.h = true;
                                tibVar.x(uib.z5);
                                return;
                            }
                            tibVar.s(this);
                            tibVar.m.h = true;
                            tibVar.q();
                            tibVar.x(uib.a);
                            return;
                        }
                        tibVar.t(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.x(uib.x5);
                    return;
                }
                tibVar.x(uib.w5);
            }
        }
    };
    public static final uib w5 = new uib("DoctypeSystemIdentifier_doubleQuoted", 62) { // from class: uib.g1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '\"') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.m.g.append(g2);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.y5);
                return;
            }
            tibVar.t(this);
            tibVar.m.g.append((char) 65533);
        }
    };
    public static final uib x5 = new uib("DoctypeSystemIdentifier_singleQuoted", 63) { // from class: uib.h1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != 0) {
                if (g2 != '\'') {
                    if (g2 != '>') {
                        if (g2 != 65535) {
                            tibVar.m.g.append(g2);
                            return;
                        }
                        tibVar.s(this);
                        tibVar.m.h = true;
                        tibVar.q();
                        tibVar.x(uib.a);
                        return;
                    }
                    tibVar.t(this);
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.x(uib.y5);
                return;
            }
            tibVar.t(this);
            tibVar.m.g.append((char) 65533);
        }
    };
    public static final uib y5 = new uib("AfterDoctypeSystemIdentifier", 64) { // from class: uib.i1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '>') {
                    if (g2 != 65535) {
                        tibVar.t(this);
                        tibVar.x(uib.z5);
                        return;
                    }
                    tibVar.s(this);
                    tibVar.m.h = true;
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                tibVar.q();
                tibVar.x(uib.a);
            }
        }
    };
    public static final uib z5 = new uib("BogusDoctype", 65) { // from class: uib.j1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char g2 = lw0Var.g();
            if (g2 != '>') {
                if (g2 == 65535) {
                    tibVar.q();
                    tibVar.x(uib.a);
                    return;
                }
                return;
            }
            tibVar.q();
            tibVar.x(uib.a);
        }
    };
    public static final uib A5 = new uib("CdataSection", 66) { // from class: uib.k1
        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            tibVar.h.append(lw0Var.q("]]>"));
            if (lw0Var.E("]]>") || lw0Var.x()) {
                tibVar.l(new kib.b(tibVar.h.toString()));
                tibVar.x(uib.a);
            }
        }
    };
    private static final /* synthetic */ uib[] E5 = a();
    static final char[] B5 = {'\t', '\n', '\f', '\r', ' ', CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.SINGLE_QUOTE_CHAR, '/', '<', '=', '>'};
    static final char[] C5 = {0, '\t', '\n', '\f', '\r', ' ', CoreConstants.DOUBLE_QUOTE_CHAR, '&', CoreConstants.SINGLE_QUOTE_CHAR, '<', '=', '>', '`'};
    private static final String D5 = String.valueOf((char) 65533);

    /* compiled from: TokeniserState.java */
    /* renamed from: uib$k */
    /* loaded from: classes3.dex */
    enum k extends uib {
        k(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.uib
        void E(tib tibVar, lw0 lw0Var) {
            char v = lw0Var.v();
            if (v != 0) {
                if (v != '&') {
                    if (v != '<') {
                        if (v != 65535) {
                            tibVar.m(lw0Var.i());
                            return;
                        } else {
                            tibVar.l(new kib.f());
                            return;
                        }
                    }
                    tibVar.a(uib.h);
                    return;
                }
                tibVar.a(uib.b);
                return;
            }
            tibVar.t(this);
            tibVar.k(lw0Var.g());
        }
    }

    private uib(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(tib tibVar, uib uibVar) {
        int[] e2 = tibVar.e(null, false);
        if (e2 == null) {
            tibVar.k('&');
        } else {
            tibVar.o(e2);
        }
        tibVar.x(uibVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(tib tibVar, lw0 lw0Var, uib uibVar, uib uibVar2) {
        if (lw0Var.K()) {
            tibVar.i(false);
            tibVar.x(uibVar);
            return;
        }
        tibVar.m("</");
        tibVar.x(uibVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(tib tibVar, lw0 lw0Var, uib uibVar, uib uibVar2) {
        char v2 = lw0Var.v();
        if (v2 != 0) {
            if (v2 != '<') {
                if (v2 != 65535) {
                    tibVar.m(lw0Var.n());
                    return;
                } else {
                    tibVar.l(new kib.f());
                    return;
                }
            }
            tibVar.a(uibVar2);
            return;
        }
        tibVar.t(uibVar);
        lw0Var.a();
        tibVar.k((char) 65533);
    }

    private static /* synthetic */ uib[] a() {
        return new uib[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, I, X, Y, Z, S4, T4, U4, V4, W4, X4, Y4, Z4, a5, b5, c5, d5, e5, f5, g5, h5, i5, j5, k5, l5, m5, n5, o5, p5, q5, r5, s5, t5, u5, v5, w5, x5, y5, z5, A5};
    }

    public static uib valueOf(String str) {
        return (uib) Enum.valueOf(uib.class, str);
    }

    public static uib[] values() {
        return (uib[]) E5.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(tib tibVar, lw0 lw0Var, uib uibVar, uib uibVar2) {
        if (lw0Var.N()) {
            String l2 = lw0Var.l();
            tibVar.h.append(l2);
            tibVar.m(l2);
            return;
        }
        char g2 = lw0Var.g();
        if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ' && g2 != '/' && g2 != '>') {
            lw0Var.V();
            tibVar.x(uibVar2);
            return;
        }
        if (tibVar.h.toString().equals("script")) {
            tibVar.x(uibVar);
        } else {
            tibVar.x(uibVar2);
        }
        tibVar.k(g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(tib tibVar, lw0 lw0Var, uib uibVar) {
        if (lw0Var.N()) {
            String l2 = lw0Var.l();
            tibVar.k.z(l2);
            tibVar.h.append(l2);
            return;
        }
        if (tibVar.v() && !lw0Var.x()) {
            char g2 = lw0Var.g();
            if (g2 != '\t' && g2 != '\n' && g2 != '\f' && g2 != '\r' && g2 != ' ') {
                if (g2 != '/') {
                    if (g2 != '>') {
                        tibVar.h.append(g2);
                    } else {
                        tibVar.r();
                        tibVar.x(a);
                        return;
                    }
                } else {
                    tibVar.x(b5);
                    return;
                }
            } else {
                tibVar.x(T4);
                return;
            }
        }
        tibVar.m("</");
        tibVar.n(tibVar.h);
        tibVar.x(uibVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void E(tib tibVar, lw0 lw0Var);

    /* synthetic */ uib(String str, int i2, k kVar) {
        this(str, i2);
    }
}
