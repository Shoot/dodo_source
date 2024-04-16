package defpackage;

import defpackage.cb5;
/* compiled from: AttributePropertyWriter.java */
/* renamed from: ez  reason: default package */
/* loaded from: classes2.dex */
public class ez extends q1c {
    protected final String t;

    protected ez(String str, ja0 ja0Var, tl tlVar, y85 y85Var) {
        this(str, ja0Var, tlVar, y85Var, ja0Var.g());
    }

    public static ez S(String str, ja0 ja0Var, tl tlVar, y85 y85Var) {
        return new ez(str, ja0Var, tlVar, y85Var);
    }

    @Override // defpackage.q1c
    protected Object P(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        return bdaVar.l0(this.t);
    }

    @Override // defpackage.q1c
    public q1c Q(w76<?> w76Var, bl blVar, ja0 ja0Var, y85 y85Var) {
        throw new IllegalStateException("Should not be called on this type");
    }

    protected ez(String str, ja0 ja0Var, tl tlVar, y85 y85Var, cb5.b bVar) {
        super(ja0Var, tlVar, y85Var, null, null, null, bVar, null);
        this.t = str;
    }
}
