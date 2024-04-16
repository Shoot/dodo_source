package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c0c;
import defpackage.nx4;
import defpackage.smb;
import defpackage.tmb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
/* compiled from: InAppMapper.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"J\u0014\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002J(\u0010-\u001a\u00020,2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0*2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002¨\u00060"}, d2 = {"Ldy4;", "", "", "Ltmb;", "nodesDto", "Lsmb;", DateTokenConverter.CONVERTER_KEY, "targeting", "", "b", "a", "Lim8;", "productSegmentationResponseDto", "Ljm8;", "j", "Lqe4;", "geoTargetingDto", "Lpe4;", c.a, "Lnx4$a;", "inAppDtoBlank", "Lk54;", "formDto", "targetingDto", "Lqx4;", "g", "Lyw5;", "logRequestDtoBlank", "Lxw5;", Image.TYPE_HIGH, "Lmx4;", "inAppConfigResponse", "Llx4;", "f", "Lw3a;", "segmentationCheckResponse", "Lx3a;", "k", "Lfx4;", "inApps", "Lv3a;", e.a, "Lkotlin/Pair;", "product", "Lgm8;", "i", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dy4  reason: default package */
/* loaded from: classes.dex */
public final class dy4 {
    private final List<String> a(smb smbVar) {
        List<String> l;
        List<String> e;
        if (smbVar instanceof smb.c) {
            ArrayList arrayList = new ArrayList();
            for (smb smbVar2 : ((smb.c) smbVar).e()) {
                pc1.C(arrayList, a(smbVar2));
            }
            return arrayList;
        } else if (smbVar instanceof smb.e) {
            e = jc1.e(((smb.e) smbVar).f());
            return e;
        } else if (!(smbVar instanceof smb.g)) {
            l = kc1.l();
            return l;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (smb smbVar3 : ((smb.g) smbVar).e()) {
                pc1.C(arrayList2, a(smbVar3));
            }
            return arrayList2;
        }
    }

    private final List<String> b(smb smbVar) {
        List<String> l;
        List<String> e;
        if (smbVar instanceof smb.c) {
            ArrayList arrayList = new ArrayList();
            for (smb smbVar2 : ((smb.c) smbVar).e()) {
                pc1.C(arrayList, b(smbVar2));
            }
            return arrayList;
        } else if (smbVar instanceof h0c) {
            e = jc1.e(((h0c) smbVar).i());
            return e;
        } else if (!(smbVar instanceof smb.g)) {
            l = kc1.l();
            return l;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (smb smbVar3 : ((smb.g) smbVar).e()) {
                pc1.C(arrayList2, b(smbVar3));
            }
            return arrayList2;
        }
    }

    private final List<smb> d(List<? extends tmb> list) {
        int w;
        wg5 wg5Var;
        t6b h0cVar;
        String F;
        String F2;
        CharSequence R0;
        boolean v;
        yg5 yg5Var;
        String F3;
        String F4;
        CharSequence R02;
        boolean v2;
        xg5 xg5Var;
        List l;
        int w2;
        String F5;
        String F6;
        CharSequence R03;
        boolean v3;
        yg5 yg5Var2;
        String F7;
        String F8;
        CharSequence R04;
        boolean v4;
        wg5 wg5Var2;
        wg5 wg5Var3;
        wg5 wg5Var4;
        wg5 wg5Var5;
        dy4 dy4Var = this;
        List<? extends tmb> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tmb tmbVar : list2) {
            if (tmbVar instanceof tmb.e) {
                String systemName = ((tmb.e) tmbVar).getSystemName();
                z65.e(systemName);
                String lowerCase = systemName.toLowerCase(Locale.ROOT);
                z65.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                h0cVar = new cb7(tmb.e.API_METHOD_CALL_JSON_NAME, lowerCase);
            } else if (tmbVar instanceof tmb.h) {
                h0cVar = new smb.f(tmb.h.TRUE_JSON_NAME);
            } else if (tmbVar instanceof tmb.d) {
                List<tmb> nodes = ((tmb.d) tmbVar).getNodes();
                z65.f(nodes, "null cannot be cast to non-null type kotlin.collections.List<cloud.mindbox.mobile_sdk.models.TreeTargetingDto>");
                h0cVar = new smb.c(tmb.d.AND_JSON_NAME, dy4Var.d(nodes));
            } else if (tmbVar instanceof tmb.g) {
                tmb.g gVar = (tmb.g) tmbVar;
                if (z65.c(gVar.getKind(), "positive")) {
                    wg5Var5 = wg5.POSITIVE;
                } else {
                    wg5Var5 = wg5.NEGATIVE;
                }
                String segmentationExternalId = gVar.getSegmentationExternalId();
                z65.e(segmentationExternalId);
                String segmentExternalId = gVar.getSegmentExternalId();
                z65.e(segmentExternalId);
                h0cVar = new smb.e(tmb.g.SEGMENT_JSON_NAME, wg5Var5, segmentationExternalId, segmentExternalId);
            } else if (tmbVar instanceof tmb.i) {
                List<tmb> nodes2 = ((tmb.i) tmbVar).getNodes();
                z65.f(nodes2, "null cannot be cast to non-null type kotlin.collections.List<cloud.mindbox.mobile_sdk.models.TreeTargetingDto>");
                h0cVar = new smb.g(tmb.i.OR_JSON_NAME, dy4Var.d(nodes2));
            } else if (tmbVar instanceof tmb.a) {
                tmb.a aVar = (tmb.a) tmbVar;
                if (z65.c(aVar.getKind(), "positive")) {
                    wg5Var4 = wg5.POSITIVE;
                } else {
                    wg5Var4 = wg5.NEGATIVE;
                }
                List<String> ids = aVar.getIds();
                z65.f(ids, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                h0cVar = new smb.a(tmb.a.CITY_JSON_NAME, wg5Var4, ids);
            } else if (tmbVar instanceof tmb.c) {
                tmb.c cVar = (tmb.c) tmbVar;
                if (z65.c(cVar.getKind(), "positive")) {
                    wg5Var3 = wg5.POSITIVE;
                } else {
                    wg5Var3 = wg5.NEGATIVE;
                }
                List<String> ids2 = cVar.getIds();
                z65.f(ids2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                h0cVar = new smb.b(tmb.c.COUNTRY_JSON_NAME, wg5Var3, ids2);
            } else if (tmbVar instanceof tmb.f) {
                tmb.f fVar = (tmb.f) tmbVar;
                if (z65.c(fVar.getKind(), "positive")) {
                    wg5Var2 = wg5.POSITIVE;
                } else {
                    wg5Var2 = wg5.NEGATIVE;
                }
                List<String> ids3 = fVar.getIds();
                z65.f(ids3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                h0cVar = new smb.d(tmb.f.REGION_JSON_NAME, wg5Var2, ids3);
            } else {
                int i = 0;
                if (tmbVar instanceof tmb.k) {
                    tmb.k kVar = (tmb.k) tmbVar;
                    String kind = kVar.getKind();
                    if (kind != null) {
                        yg5[] values = yg5.values();
                        int length = values.length;
                        while (true) {
                            if (i < length) {
                                yg5 yg5Var3 = values[i];
                                F7 = l0b.F(yg5Var3.name(), "_", "", false, 4, null);
                                int i2 = length;
                                yg5[] yg5VarArr = values;
                                F8 = l0b.F(kind, "_", "", false, 4, null);
                                R04 = m0b.R0(F8);
                                v4 = l0b.v(F7, R04.toString(), true);
                                if (v4) {
                                    yg5Var2 = yg5Var3;
                                    break;
                                }
                                i++;
                                length = i2;
                                values = yg5VarArr;
                            } else {
                                yg5Var2 = null;
                                break;
                            }
                        }
                        if (yg5Var2 != null) {
                            String value = kVar.getValue();
                            z65.e(value);
                            h0cVar = new d0c(tmb.k.VIEW_PRODUCT_CATEGORY_ID_JSON_NAME, yg5Var2, value);
                        }
                    }
                    throw new IllegalArgumentException("Value for " + kind + " could not be found");
                } else if (tmbVar instanceof tmb.j) {
                    tmb.j jVar = (tmb.j) tmbVar;
                    String kind2 = jVar.getKind();
                    if (kind2 != null) {
                        xg5[] values2 = xg5.values();
                        int length2 = values2.length;
                        while (true) {
                            if (i < length2) {
                                xg5 xg5Var2 = values2[i];
                                F5 = l0b.F(xg5Var2.name(), "_", "", false, 4, null);
                                int i3 = length2;
                                F6 = l0b.F(kind2, "_", "", false, 4, null);
                                R03 = m0b.R0(F6);
                                v3 = l0b.v(F5, R03.toString(), true);
                                if (v3) {
                                    xg5Var = xg5Var2;
                                    break;
                                }
                                i++;
                                length2 = i3;
                            } else {
                                xg5Var = null;
                                break;
                            }
                        }
                        if (xg5Var != null) {
                            List<tmb.j.b> values3 = jVar.getValues();
                            if (values3 == null) {
                                l = kc1.l();
                            } else {
                                List<tmb.j.b> list3 = values3;
                                w2 = lc1.w(list3, 10);
                                l = new ArrayList(w2);
                                for (tmb.j.b bVar : list3) {
                                    String id = bVar.getId();
                                    z65.e(id);
                                    String externalId = bVar.getExternalId();
                                    z65.e(externalId);
                                    String externalSystemName = bVar.getExternalSystemName();
                                    z65.e(externalSystemName);
                                    l.add(new c0c.a(id, externalId, externalSystemName));
                                }
                            }
                            h0cVar = new c0c(tmb.k.VIEW_PRODUCT_CATEGORY_ID_JSON_NAME, xg5Var, l);
                        }
                    }
                    throw new IllegalArgumentException("Value for " + kind2 + " could not be found");
                } else if (tmbVar instanceof tmb.l) {
                    tmb.l lVar = (tmb.l) tmbVar;
                    String kind3 = lVar.getKind();
                    if (kind3 != null) {
                        yg5[] values4 = yg5.values();
                        int length3 = values4.length;
                        while (true) {
                            if (i < length3) {
                                yg5Var = values4[i];
                                F3 = l0b.F(yg5Var.name(), "_", "", false, 4, null);
                                F4 = l0b.F(kind3, "_", "", false, 4, null);
                                R02 = m0b.R0(F4);
                                v2 = l0b.v(F3, R02.toString(), true);
                                if (v2) {
                                    break;
                                }
                                i++;
                            } else {
                                yg5Var = null;
                                break;
                            }
                        }
                        if (yg5Var != null) {
                            String value2 = lVar.getValue();
                            z65.e(value2);
                            h0cVar = new f0c(tmb.l.VIEW_PRODUCT_ID_JSON_NAME, yg5Var, value2);
                        }
                    }
                    throw new IllegalArgumentException("Value for " + kind3 + " could not be found");
                } else if (tmbVar instanceof tmb.m) {
                    tmb.m mVar = (tmb.m) tmbVar;
                    String kind4 = mVar.getKind();
                    if (kind4 != null) {
                        wg5[] values5 = wg5.values();
                        int length4 = values5.length;
                        while (true) {
                            if (i < length4) {
                                wg5Var = values5[i];
                                F = l0b.F(wg5Var.name(), "_", "", false, 4, null);
                                F2 = l0b.F(kind4, "_", "", false, 4, null);
                                R0 = m0b.R0(F2);
                                v = l0b.v(F, R0.toString(), true);
                                if (v) {
                                    break;
                                }
                                i++;
                            } else {
                                wg5Var = null;
                                break;
                            }
                        }
                        if (wg5Var != null) {
                            String segmentationExternalId2 = mVar.getSegmentationExternalId();
                            z65.e(segmentationExternalId2);
                            String segmentExternalId2 = mVar.getSegmentExternalId();
                            z65.e(segmentExternalId2);
                            h0cVar = new h0c(tmb.m.VIEW_PRODUCT_SEGMENT_JSON_NAME, wg5Var, segmentationExternalId2, segmentExternalId2);
                        }
                    }
                    throw new IllegalArgumentException("Value for " + kind4 + " could not be found");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(h0cVar);
            dy4Var = this;
        }
        return arrayList;
    }

    public final pe4 c(qe4 qe4Var) {
        z65.h(qe4Var, "geoTargetingDto");
        String a = qe4Var.a();
        String str = "";
        if (a == null) {
            a = "";
        }
        String c = qe4Var.c();
        if (c == null) {
            c = "";
        }
        String b = qe4Var.b();
        if (b != null) {
            str = b;
        }
        return new pe4(a, c, str);
    }

    public final v3a e(List<fx4> list) {
        String str;
        int w;
        z65.h(list, "inApps");
        ArrayList arrayList = new ArrayList();
        for (fx4 fx4Var : list) {
            List<String> a = a(fx4Var.c());
            w = lc1.w(a, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (String str2 : a) {
                arrayList2.add(new y3a(new qt4(str2)));
            }
            pc1.C(arrayList, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            qt4 ids = ((y3a) obj).getIds();
            if (ids != null) {
                str = ids.getExternalId();
            } else {
                str = null;
            }
            if (hashSet.add(str)) {
                arrayList3.add(obj);
            }
        }
        return new v3a(arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e9, code lost:
        if (r0 == null) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lx4 f(defpackage.mx4 r33) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy4.f(mx4):lx4");
    }

    public final qx4 g(nx4.a aVar, k54 k54Var, tmb tmbVar) {
        z65.h(aVar, "inAppDtoBlank");
        return new qx4(aVar.getId(), aVar.getSdkVersion(), tmbVar, k54Var);
    }

    public final xw5 h(yw5 yw5Var) {
        z65.h(yw5Var, "logRequestDtoBlank");
        String requestId = yw5Var.getRequestId();
        z65.e(requestId);
        String deviceId = yw5Var.getDeviceId();
        z65.e(deviceId);
        String from = yw5Var.getFrom();
        z65.e(from);
        String to = yw5Var.getTo();
        z65.e(to);
        return new xw5(requestId, deviceId, from, to);
    }

    public final gm8 i(Pair<String, String> pair, List<fx4> list) {
        List e;
        int w;
        z65.h(pair, "product");
        z65.h(list, "inApps");
        e = jc1.e(new cm8(new Ids(pair)));
        ArrayList arrayList = new ArrayList();
        for (fx4 fx4Var : list) {
            List<String> b = b(fx4Var.c());
            w = lc1.w(b, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (String str : b) {
                arrayList2.add(new a4a(new b4a(str)));
            }
            pc1.C(arrayList, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((a4a) obj).a().a())) {
                arrayList3.add(obj);
            }
        }
        return new gm8(e, arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r7 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jm8 j(defpackage.im8 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productSegmentationResponseDto"
            defpackage.z65.h(r9, r0)
            java.util.List r9 = r9.a()
            if (r9 == 0) goto La9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = defpackage.ic1.w(r9, r1)
            r0.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L1c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r9.next()
            em8 r2 = (defpackage.em8) r2
            if (r2 == 0) goto L9b
            java.util.List r2 = r2.a()
            if (r2 == 0) goto L9b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ic1.w(r2, r1)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r2.next()
            c4a r4 = (defpackage.c4a) r4
            hm8 r5 = new hm8
            java.lang.String r6 = ""
            if (r4 == 0) goto L6d
            cloud.mindbox.mobile_sdk.models.operation.Ids r7 = r4.a()
            if (r7 == 0) goto L6d
            java.util.Map r7 = r7.getIds()
            if (r7 == 0) goto L6d
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L6d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = defpackage.ic1.Y(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L6e
        L6d:
            r7 = r6
        L6e:
            if (r4 == 0) goto L94
            u3a r4 = r4.b()
            if (r4 == 0) goto L94
            cloud.mindbox.mobile_sdk.models.operation.Ids r4 = r4.a()
            if (r4 == 0) goto L94
            java.util.Map r4 = r4.getIds()
            if (r4 == 0) goto L94
            java.util.Collection r4 = r4.values()
            if (r4 == 0) goto L94
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = defpackage.ic1.Y(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L93
            goto L94
        L93:
            r6 = r4
        L94:
            r5.<init>(r7, r6)
            r3.add(r5)
            goto L3f
        L9b:
            java.util.List r3 = defpackage.ic1.l()
        L9f:
            dm8 r2 = new dm8
            r2.<init>(r3)
            r0.add(r2)
            goto L1c
        La9:
            java.util.List r0 = defpackage.ic1.l()
        Lad:
            jm8 r9 = new jm8
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy4.j(im8):jm8");
    }

    public final x3a k(w3a w3aVar) {
        List l;
        int w;
        String str;
        String str2;
        rt4 ids;
        rt4 ids2;
        rt4 ids3;
        z65.h(w3aVar, "segmentationCheckResponse");
        String status = w3aVar.getStatus();
        if (status == null) {
            status = "";
        }
        List<s52> customerSegmentations = w3aVar.getCustomerSegmentations();
        if (customerSegmentations == null) {
            l = kc1.l();
        } else {
            ArrayList<s52> arrayList = new ArrayList();
            Iterator<T> it = customerSegmentations.iterator();
            while (true) {
                String str3 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                z3a segmentation = ((s52) next).getSegmentation();
                if (segmentation != null && (ids3 = segmentation.getIds()) != null) {
                    str3 = ids3.getExternalId();
                }
                if (str3 != null) {
                    arrayList.add(next);
                }
            }
            w = lc1.w(arrayList, 10);
            l = new ArrayList(w);
            for (s52 s52Var : arrayList) {
                z3a segmentation2 = s52Var.getSegmentation();
                if (segmentation2 != null && (ids2 = segmentation2.getIds()) != null) {
                    str = ids2.getExternalId();
                } else {
                    str = null;
                }
                z65.e(str);
                s3a segment = s52Var.getSegment();
                if (segment == null || (ids = segment.getIds()) == null || (str2 = ids.getExternalId()) == null) {
                    str2 = "";
                }
                l.add(new r52(str, str2));
            }
        }
        return new x3a(status, l);
    }
}
