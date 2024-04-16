package im.threads.ui.activities;

import androidx.viewpager.widget.ViewPager;
import im.threads.business.models.FileDescription;
import im.threads.ui.adapters.ImagesAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ImagesActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lim/threads/business/models/FileDescription;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ImagesActivity$onCreate$2 extends ej5 implements Function1<List<? extends FileDescription>, Unit> {
    final /* synthetic */ ImagesActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesActivity$onCreate$2(ImagesActivity imagesActivity) {
        super(1);
        this.this$0 = imagesActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends FileDescription> list) {
        invoke2((List<FileDescription>) list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FileDescription> list) {
        ViewPager viewPager;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ViewPager viewPager2;
        viewPager = this.this$0.mViewPager;
        ViewPager viewPager3 = null;
        if (viewPager == null) {
            z65.z("mViewPager");
            viewPager = null;
        }
        arrayList = this.this$0.files;
        viewPager.setAdapter(new ImagesAdapter(arrayList, this.this$0.getSupportFragmentManager()));
        FileDescription fileDescription = (FileDescription) this.this$0.getIntent().getParcelableExtra("FileDescription");
        if (fileDescription != null) {
            arrayList2 = this.this$0.files;
            int indexOf = arrayList2.indexOf(fileDescription);
            arrayList3 = this.this$0.files;
            arrayList3.set(indexOf, fileDescription);
            if (indexOf != -1) {
                viewPager2 = this.this$0.mViewPager;
                if (viewPager2 == null) {
                    z65.z("mViewPager");
                } else {
                    viewPager3 = viewPager2;
                }
                viewPager3.setCurrentItem(indexOf);
                this.this$0.onPageSelected(indexOf);
            }
        }
        this.this$0.onPageSelected(0);
    }
}
