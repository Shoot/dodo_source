package defpackage;
/* compiled from: MinimalClassNameIdResolver.java */
/* renamed from: ll6  reason: default package */
/* loaded from: classes2.dex */
public class ll6 extends l81 {
    protected final String d;
    protected final String e;

    protected ll6(y85 y85Var, rnb rnbVar, se8 se8Var) {
        super(y85Var, rnbVar, se8Var);
        String name = y85Var.u().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.d = "";
            this.e = ".";
            return;
        }
        this.e = name.substring(0, lastIndexOf + 1);
        this.d = name.substring(0, lastIndexOf);
    }

    public static ll6 f(y85 y85Var, w76<?> w76Var, se8 se8Var) {
        return new ll6(y85Var, w76Var.M(), se8Var);
    }

    @Override // defpackage.l81, defpackage.snb
    public String a(Object obj) {
        String name = obj.getClass().getName();
        if (name.startsWith(this.e)) {
            return name.substring(this.e.length() - 1);
        }
        return name;
    }
}
