package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] g = new StackTraceElement[0];
    private final List<Throwable> a;
    private se5 b;
    private dl2 c;
    private Class<?> d;
    private String e;
    private Exception f;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).e()) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).j(appendable);
            } else {
                d(th, appendable);
            }
            i = i2;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void j(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        String str3 = "";
        if (this.d == null) {
            str = "";
        } else {
            str = ", " + this.d;
        }
        sb.append(str);
        if (this.c == null) {
            str2 = "";
        } else {
            str2 = ", " + this.c;
        }
        sb.append(str2);
        if (this.b != null) {
            str3 = ", " + this.b;
        }
        sb.append(str3);
        List<Throwable> f = f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(th.getMessage());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void i(String str) {
        List<Throwable> f = f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(se5 se5Var, dl2 dl2Var) {
        l(se5Var, dl2Var, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(se5 se5Var, dl2 dl2Var, Class<?> cls) {
        this.b = se5Var;
        this.c = dl2Var;
        this.d = cls;
    }

    public void m(Exception exc) {
        this.f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        private final Appendable a;
        private boolean b = true;

        a(Appendable appendable) {
            this.a = appendable;
        }

        @NonNull
        private CharSequence a(CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            this.b = c == '\n';
            this.a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(a, i, i2);
            return this;
        }
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        j(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.e = str;
        setStackTrace(g);
        this.a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        j(printWriter);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
