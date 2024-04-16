package com.dodopizza.feature.imagepicker.presentation;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.Metadata;
/* compiled from: ImagePickerDialogResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/a;", "", "a", "b", "Lcom/dodopizza/feature/imagepicker/presentation/a$a;", "Lcom/dodopizza/feature/imagepicker/presentation/a$b;", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface a {

    /* compiled from: ImagePickerDialogResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/a$a;", "Lcom/dodopizza/feature/imagepicker/presentation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Ljava/io/File;)V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.feature.imagepicker.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0121a implements a {
        private final File a;

        public C0121a(File file) {
            z65.h(file, Action.FILE_ATTRIBUTE);
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0121a) && z65.c(this.a, ((C0121a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            File file = this.a;
            return "ImagePicked(file=" + file + ")";
        }
    }

    /* compiled from: ImagePickerDialogResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/a$b;", "Lcom/dodopizza/feature/imagepicker/presentation/a;", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b implements a {
        public static final b a = new b();

        private b() {
        }
    }
}
