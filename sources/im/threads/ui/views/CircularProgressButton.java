package im.threads.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import im.threads.R;
import im.threads.ui.utils.ViewUtils;
/* loaded from: classes3.dex */
public final class CircularProgressButton extends FrameLayout {
    private Drawable completedDrawable;
    private Drawable inProgress;
    private View mImageLabel;
    private MyCircleProgress mcp;
    private Drawable progressBackgroundDrawable;
    private Drawable startDownloadDrawable;
    private final ViewUtils viewUtils;

    public CircularProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewUtils = new ViewUtils();
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.ecc_view_progress_button, (ViewGroup) this, true);
        this.mcp = (MyCircleProgress) findViewById(R.id.circular_progress);
        this.mImageLabel = findViewById(R.id.label_image);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircularProgressButton, 0, 0);
        this.completedDrawable = obtainStyledAttributes.getDrawable(R.styleable.CircularProgressButton_completed_drawable);
        this.inProgress = obtainStyledAttributes.getDrawable(R.styleable.CircularProgressButton_in_progress_label);
        this.startDownloadDrawable = obtainStyledAttributes.getDrawable(R.styleable.CircularProgressButton_start_download_label);
        View findViewById = findViewById(R.id.background);
        obtainStyledAttributes.recycle();
        this.mImageLabel.setVisibility(0);
        this.mcp.setVisibility(0);
        findViewById.setVisibility(0);
        this.mImageLabel.setBackground(this.startDownloadDrawable);
        Drawable b = on.b(getContext(), R.drawable.ecc_circle_gray_48dp);
        this.progressBackgroundDrawable = b;
        findViewById.setBackground(b);
        setBackground(null);
    }

    public void setBackgroundColorResId(int i) {
        this.progressBackgroundDrawable.setColorFilter(iu1.c(getContext(), i), PorterDuff.Mode.SRC_ATOP);
    }

    public void setCompletedDrawable(Drawable drawable) {
        this.completedDrawable = drawable;
    }

    public void setInProgress(Drawable drawable) {
        this.inProgress = drawable;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.viewUtils.setClickListener((ViewGroup) findViewById(R.id.frame), onClickListener);
    }

    public void setProgress(int i) {
        this.mcp.setProgress(i);
        if (i > 0 && i < 100) {
            this.mcp.setVisibility(0);
            this.mImageLabel.setBackground(this.inProgress);
        } else if (i > 99) {
            this.mcp.setVisibility(4);
            this.mImageLabel.setBackground(this.completedDrawable);
        } else if (i == 0) {
            this.mcp.setVisibility(0);
            this.mImageLabel.setBackground(this.startDownloadDrawable);
        }
    }

    public void setStartDownloadDrawable(Drawable drawable) {
        this.startDownloadDrawable = drawable;
    }

    public CircularProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewUtils = new ViewUtils();
        init(attributeSet);
    }
}
