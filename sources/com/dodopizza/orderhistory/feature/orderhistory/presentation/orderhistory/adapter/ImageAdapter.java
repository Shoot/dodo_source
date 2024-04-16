package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0019B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/ImageAdapter$ImageViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "j", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "getItemCount", "holder", "position", "", "k", "", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "a", "Ljava/util/List;", "imageUrls", "<init>", "(Ljava/util/List;)V", "b", "ImageViewHolder", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ImageAdapter extends RecyclerView.h<ImageViewHolder> {
    public static final a b = new a(null);
    private static final int c = hy8.order_history_image_view;
    private final List<b> a;

    /* compiled from: ImageAdapter.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/ImageAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$b;", "productImage", "", "showSimpleProductImage", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$a;", "showHalvesProductImage", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "setImageUrl", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class ImageViewHolder extends RecyclerView.d0 {
        static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ImageViewHolder.class, "imageView", "getImageView()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0))};
        private final k79 imageView$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(View view) {
            super(view);
            z65.h(view, "view");
            this.imageView$delegate = kb0.g(this, ImageAdapter.c);
        }

        private final DoubleImageView getImageView() {
            return (DoubleImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
        }

        private final void showHalvesProductImage(b.a aVar) {
            boolean z;
            DoubleImageView imageView = getImageView();
            if (aVar.c() == b78.a) {
                z = true;
            } else {
                z = false;
            }
            imageView.setHasOffset(z);
            t63.a.a(getImageView(), aVar.b(), aVar.d(), aVar.a());
        }

        private final void showSimpleProductImage(b.C0210b c0210b) {
            com.bumptech.glide.b.u(this.itemView).t(c0210b.b()).a0(c0210b.a()).G0(getImageView().getSingleImageView());
        }

        public final void setImageUrl(b bVar) {
            z65.h(bVar, "productImage");
            if (bVar instanceof b.C0210b) {
                showSimpleProductImage((b.C0210b) bVar);
            } else if (bVar instanceof b.a) {
                showHalvesProductImage((b.a) bVar);
            }
        }
    }

    /* compiled from: ImageAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/ImageAdapter$a;", "", "", "IMAGE_VIEW_DP_SIZE", "F", "", "IMAGE_VIEW_ID", "I", "IMAGE_VIEW_RIGHT_MARGIN_DP", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageAdapter(List<? extends b> list) {
        z65.h(list, "imageUrls");
        this.a = list;
    }

    private final View j(Context context) {
        int a2 = mpb.a(48.0f, context);
        int a3 = mpb.a(8.0f, context);
        FrameLayout frameLayout = new FrameLayout(context);
        View doubleImageView = new DoubleImageView(context);
        doubleImageView.setId(c);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a2, a2);
        marginLayoutParams.setMargins(0, 0, a3, 0);
        doubleImageView.setLayoutParams(marginLayoutParams);
        frameLayout.addView(doubleImageView);
        return frameLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k */
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {
        z65.h(imageViewHolder, "holder");
        imageViewHolder.setImageUrl(this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: l */
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        Context context = viewGroup.getContext();
        z65.g(context, "getContext(...)");
        return new ImageViewHolder(j(context));
    }
}
