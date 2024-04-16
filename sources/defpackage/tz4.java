package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ns7;
import defpackage.nx4;
import defpackage.tmb;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppValidatorImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Ltz4;", "Lsz4;", "", "id", "Ltmb;", "targeting", "", DateTokenConverter.CONVERTER_KEY, "Lqx4;", "inApp", c.a, "Lnx4$a;", "inAppDto", "b", "a", "Lzx9;", "Lzx9;", "sdkVersionValidator", "<init>", "(Lzx9;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tz4  reason: default package */
/* loaded from: classes.dex */
public final class tz4 implements sz4 {
    public static final a b = new a(null);
    private final zx9 a;

    /* compiled from: InAppValidatorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Ltz4$a;", "", "", "ANY", "Ljava/lang/String;", "ENDS_WITH", "NEGATIVE", "NONE", "NOT_SUBSTRING", "POSITIVE", "STARTS_WITH", "SUBSTRING", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tz4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tz4(zx9 zx9Var) {
        z65.h(zx9Var, "sdkVersionValidator");
        this.a = zx9Var;
    }

    private final boolean c(qx4 qx4Var) {
        List<ns7> list;
        List<ns7> variants;
        boolean z;
        boolean z2;
        k54 form = qx4Var.getForm();
        if (form != null) {
            list = form.getVariants();
        } else {
            list = null;
        }
        List<ns7> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        k54 form2 = qx4Var.getForm();
        if (form2 == null || (variants = form2.getVariants()) == null || (r0 = variants.iterator()) == null) {
            return true;
        }
        boolean z3 = true;
        for (ns7 ns7Var : variants) {
            if (ns7Var == null) {
                fk6 fk6Var = fk6.a;
                fk6Var.d(this, "payload is null for in-app with id " + qx4Var.getId());
            } else if (ns7Var instanceof ns7.a) {
                ns7.a aVar = (ns7.a) ns7Var;
                if (aVar.getType() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (aVar.getImageUrl() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z | z2) {
                    fk6 fk6Var2 = fk6.a;
                    fk6Var2.d(this, "some properties of in-app with id " + qx4Var.getId() + " are null. type: " + aVar.getType() + ", imageUrl: " + aVar.getImageUrl());
                }
            }
            z3 = false;
        }
        return z3;
    }

    private final boolean d(String str, tmb tmbVar) {
        boolean y;
        String value;
        boolean y2;
        boolean y3;
        String segmentationExternalId;
        boolean y4;
        String segmentExternalId;
        boolean y5;
        String segmentationInternalId;
        boolean y6;
        boolean y7;
        List<tmb.j.b> values;
        boolean y8;
        String externalId;
        boolean y9;
        String externalSystemName;
        boolean y10;
        boolean y11;
        String value2;
        boolean y12;
        String systemName;
        List<String> ids;
        List<String> ids2;
        List<String> ids3;
        boolean z = false;
        if (tmbVar == null) {
            fk6 fk6Var = fk6.a;
            fk6Var.d(this, "targeting is null for in-app with " + str);
            return false;
        }
        boolean z2 = true;
        if (tmbVar instanceof tmb.i) {
            tmb.i iVar = (tmb.i) tmbVar;
            List<tmb> nodes = iVar.getNodes();
            if (nodes != null && !nodes.isEmpty()) {
                for (tmb tmbVar2 : iVar.getNodes()) {
                    if (!d(str, tmbVar2)) {
                        z2 = false;
                    }
                }
            } else {
                fk6 fk6Var2 = fk6.a;
                fk6Var2.d(this, "nodes is " + iVar.getNodes() + " for in-app with id " + str);
                return false;
            }
        } else if (tmbVar instanceof tmb.d) {
            tmb.d dVar = (tmb.d) tmbVar;
            List<tmb> nodes2 = dVar.getNodes();
            if (nodes2 != null && !nodes2.isEmpty()) {
                for (tmb tmbVar3 : dVar.getNodes()) {
                    if (!d(str, tmbVar3)) {
                        z2 = false;
                    }
                }
            } else {
                fk6 fk6Var3 = fk6.a;
                fk6Var3.d(this, "nodes is " + dVar.getNodes() + " for in-app with id " + str);
                return false;
            }
        } else if (tmbVar instanceof tmb.g) {
            tmb.g gVar = (tmb.g) tmbVar;
            if (gVar.getSegmentExternalId() != null && gVar.getSegmentationInternalId() != null && vn3.f(gVar.getKind(), "positive", "negative") && gVar.getSegmentationExternalId() != null && gVar.getType() != null) {
                z = true;
            }
            if (!z) {
                fk6.a.d(this, "some segment properties are corrupted");
                return z;
            }
            return z;
        } else {
            if (tmbVar instanceof tmb.h) {
                if (((tmb.h) tmbVar).getType() == null) {
                    return false;
                }
            } else if (tmbVar instanceof tmb.a) {
                tmb.a aVar = (tmb.a) tmbVar;
                if (aVar.getType() == null || (ids3 = aVar.getIds()) == null || ids3.isEmpty() || !vn3.f(aVar.getKind(), "positive", "negative")) {
                    return false;
                }
            } else if (tmbVar instanceof tmb.c) {
                tmb.c cVar = (tmb.c) tmbVar;
                if (cVar.getType() == null || (ids2 = cVar.getIds()) == null || ids2.isEmpty() || !vn3.f(cVar.getKind(), "positive", "negative")) {
                    return false;
                }
            } else if (tmbVar instanceof tmb.f) {
                tmb.f fVar = (tmb.f) tmbVar;
                if (fVar.getType() == null || (ids = fVar.getIds()) == null || ids.isEmpty() || !vn3.f(fVar.getKind(), "positive", "negative")) {
                    return false;
                }
            } else if (tmbVar instanceof tmb.e) {
                tmb.e eVar = (tmb.e) tmbVar;
                String type = eVar.getType();
                if (type == null || type.length() == 0 || (systemName = eVar.getSystemName()) == null || systemName.length() == 0) {
                    return false;
                }
            } else if (tmbVar instanceof tmb.k) {
                tmb.k kVar = (tmb.k) tmbVar;
                String type2 = kVar.getType();
                if (type2 != null) {
                    y11 = l0b.y(type2);
                    if (!y11 && vn3.f(kVar.getKind(), "substring", "notSubstring", "startsWith", "endsWith") && (value2 = kVar.getValue()) != null) {
                        y12 = l0b.y(value2);
                        if (y12) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (tmbVar instanceof tmb.j) {
                tmb.j jVar = (tmb.j) tmbVar;
                String type3 = jVar.getType();
                if (type3 != null) {
                    y7 = l0b.y(type3);
                    if (y7 || !vn3.f(jVar.getKind(), "any", "none") || (values = jVar.getValues()) == null || values.isEmpty()) {
                        return false;
                    }
                    List<tmb.j.b> values2 = jVar.getValues();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        for (tmb.j.b bVar : values2) {
                            String id = bVar.getId();
                            if (id != null) {
                                y8 = l0b.y(id);
                                if (!y8 && (externalId = bVar.getExternalId()) != null) {
                                    y9 = l0b.y(externalId);
                                    if (!y9 && (externalSystemName = bVar.getExternalSystemName()) != null) {
                                        y10 = l0b.y(externalSystemName);
                                        if (y10) {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    }
                } else {
                    return false;
                }
            } else if (tmbVar instanceof tmb.m) {
                tmb.m mVar = (tmb.m) tmbVar;
                String type4 = mVar.getType();
                if (type4 != null) {
                    y3 = l0b.y(type4);
                    if (!y3 && vn3.f(mVar.getKind(), "positive", "negative") && (segmentationExternalId = mVar.getSegmentationExternalId()) != null) {
                        y4 = l0b.y(segmentationExternalId);
                        if (!y4 && (segmentExternalId = mVar.getSegmentExternalId()) != null) {
                            y5 = l0b.y(segmentExternalId);
                            if (!y5 && (segmentationInternalId = mVar.getSegmentationInternalId()) != null) {
                                y6 = l0b.y(segmentationInternalId);
                                if (y6) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (tmbVar instanceof tmb.l) {
                tmb.l lVar = (tmb.l) tmbVar;
                String type5 = lVar.getType();
                if (type5 != null) {
                    y = l0b.y(type5);
                    if (!y && vn3.f(lVar.getKind(), "substring", "notSubstring", "startsWith", "endsWith") && (value = lVar.getValue()) != null) {
                        y2 = l0b.y(value);
                        if (y2) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return z2;
    }

    @Override // defpackage.sz4
    public boolean a(qx4 qx4Var) {
        z65.h(qx4Var, "inApp");
        return c(qx4Var) & d(qx4Var.getId(), qx4Var.getTargeting());
    }

    @Override // defpackage.sz4
    public boolean b(nx4.a aVar) {
        z65.h(aVar, "inAppDto");
        return this.a.a(aVar.getSdkVersion());
    }
}
