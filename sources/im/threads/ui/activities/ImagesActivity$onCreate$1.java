package im.threads.ui.activities;

import android.os.Build;
import im.threads.business.models.FileDescription;
import im.threads.business.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToLongFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ImagesActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "data", "", "Lim/threads/business/models/FileDescription;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ImagesActivity$onCreate$1 extends ej5 implements Function1<List<? extends FileDescription>, Unit> {
    final /* synthetic */ ImagesActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagesActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "lhs", "Lim/threads/business/models/FileDescription;", "rhs", "invoke", "(Lim/threads/business/models/FileDescription;Lim/threads/business/models/FileDescription;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.ui.activities.ImagesActivity$onCreate$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends ej5 implements Function2<FileDescription, FileDescription, Integer> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(FileDescription fileDescription, FileDescription fileDescription2) {
            z65.h(fileDescription, "lhs");
            z65.h(fileDescription2, "rhs");
            return Integer.valueOf(z65.k(fileDescription.getTimeStamp(), fileDescription2.getTimeStamp()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesActivity$onCreate$1(ImagesActivity imagesActivity) {
        super(1);
        this.this$0 = imagesActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Number) function1.invoke(obj)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2(Function2 function2, Object obj, Object obj2) {
        z65.h(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends FileDescription> list) {
        invoke2((List<FileDescription>) list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FileDescription> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Comparator comparingLong;
        ArrayList arrayList4;
        if (list != null) {
            ImagesActivity imagesActivity = this.this$0;
            for (FileDescription fileDescription : list) {
                if (FileUtils.isImage(fileDescription)) {
                    arrayList4 = imagesActivity.files;
                    z65.e(fileDescription);
                    arrayList4.add(fileDescription);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList3 = this.this$0.files;
            final AnonymousClass2 anonymousClass2 = new wq6() { // from class: im.threads.ui.activities.ImagesActivity$onCreate$1.2
                @Override // defpackage.wq6, defpackage.le5
                public Object get(Object obj) {
                    return Long.valueOf(((FileDescription) obj).getTimeStamp());
                }

                @Override // defpackage.wq6
                public void set(Object obj, Object obj2) {
                    ((FileDescription) obj).setTimeStamp(((Number) obj2).longValue());
                }
            };
            comparingLong = Comparator.comparingLong(new ToLongFunction() { // from class: im.threads.ui.activities.a
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long invoke$lambda$1;
                    invoke$lambda$1 = ImagesActivity$onCreate$1.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            Collections.sort(arrayList3, comparingLong);
        } else {
            arrayList = this.this$0.files;
            final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
            oc1.B(arrayList, new Comparator() { // from class: im.threads.ui.activities.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int invoke$lambda$2;
                    invoke$lambda$2 = ImagesActivity$onCreate$1.invoke$lambda$2(Function2.this, obj, obj2);
                    return invoke$lambda$2;
                }
            });
        }
        ImagesActivity imagesActivity2 = this.this$0;
        arrayList2 = imagesActivity2.files;
        imagesActivity2.collectionSize = arrayList2.size();
    }
}
