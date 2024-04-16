package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/* compiled from: StaggeredDelimiterProcessor.java */
/* renamed from: ita  reason: default package */
/* loaded from: classes3.dex */
class ita implements mu2 {
    private final char a;
    private int b = 0;
    private LinkedList<mu2> c = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ita(char c) {
        this.a = c;
    }

    private mu2 g(int i) {
        Iterator<mu2> it = this.c.iterator();
        while (it.hasNext()) {
            mu2 next = it.next();
            if (next.c() <= i) {
                return next;
            }
        }
        return this.c.getFirst();
    }

    @Override // defpackage.mu2
    public void a(g9b g9bVar, g9b g9bVar2, int i) {
        g(i).a(g9bVar, g9bVar2, i);
    }

    @Override // defpackage.mu2
    public char b() {
        return this.a;
    }

    @Override // defpackage.mu2
    public int c() {
        return this.b;
    }

    @Override // defpackage.mu2
    public char d() {
        return this.a;
    }

    @Override // defpackage.mu2
    public int e(nu2 nu2Var, nu2 nu2Var2) {
        return g(nu2Var.length()).e(nu2Var, nu2Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(mu2 mu2Var) {
        int c = mu2Var.c();
        ListIterator<mu2> listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            int c2 = listIterator.next().c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(mu2Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        this.c.add(mu2Var);
        this.b = c;
    }
}
