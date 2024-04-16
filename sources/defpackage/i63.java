package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.b;
import com.inappstory.sdk.stories.ui.views.IStoriesListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodoStoryListItem.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J-\u0010\u0010\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001c\u0010\u001e\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006$"}, d2 = {"Li63;", "Lcom/inappstory/sdk/stories/ui/views/IStoriesListItem;", "", "backgroundColor", "Landroid/graphics/drawable/GradientDrawable;", "a", "Landroid/view/View;", "getView", "getVideoView", "view", "id", "", "setId", "", "title", "titleColor", "setTitle", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;)V", "imageFilePath", "setImage", "", "hasAudio", "setHasAudio", "filePathOnVideo", "setVideo", "hasOpened", "setOpened", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i63  reason: default package */
/* loaded from: classes2.dex */
public final class i63 implements IStoriesListItem {
    private static final a b = new a(null);
    public static final int c = 8;
    private final LayoutInflater a;

    /* compiled from: DodoStoryListItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Li63$a;", "", "", "OPENED_STORIES_ALPHA", "F", "", "STORIES_CORNER_RADIUS", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i63$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i63(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = LayoutInflater.from(context);
    }

    private final GradientDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(jx9.a.a(12));
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public View getVideoView() {
        View inflate = this.a.inflate(gz8.item_story_video_preview, (ViewGroup) null, false);
        z65.g(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public View getView() {
        View inflate = this.a.inflate(gz8.item_story_preview, (ViewGroup) null, false);
        z65.g(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setImage(View view, String str, int i) {
        AppCompatImageView appCompatImageView;
        boolean y;
        if (view != null) {
            appCompatImageView = (AppCompatImageView) view.findViewById(gy8.S2);
        } else {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setClipToOutline(true);
            if (str != null) {
                y = l0b.y(str);
                if (!y && !av1.b(appCompatImageView.getContext())) {
                    b.t(appCompatImageView.getContext()).t(str).s0(new wt0(), new mo9(jx9.a.a(12))).a0(bx8.story_placeholder_background).G0(appCompatImageView);
                    return;
                }
            }
            appCompatImageView.setBackground(a(i));
        }
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setOpened(View view, boolean z) {
        if (z && view != null) {
            view.setAlpha(0.6f);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setVideo(View view, String str) {
        VideoView videoView;
        boolean y;
        if (view != null) {
            videoView = (VideoView) view.findViewById(gy8.videoPreview);
        } else {
            videoView = null;
        }
        if (videoView != null) {
            if (str != null) {
                y = l0b.y(str);
                if (!y) {
                    videoView.setVideoPath(str);
                    videoView.start();
                    return;
                }
            }
            videoView.setBackground(a(iu1.c(videoView.getContext(), ew8.s)));
        }
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setHasAudio(View view, boolean z) {
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setId(View view, int i) {
    }

    @Override // com.inappstory.sdk.stories.ui.views.IStoriesListItem
    public void setTitle(View view, String str, Integer num) {
    }
}
