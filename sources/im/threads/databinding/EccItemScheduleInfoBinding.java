package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.ScheduleAlertTextView;
/* loaded from: classes3.dex */
public final class EccItemScheduleInfoBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView scheduleIcon;
    @NonNull
    public final ScheduleAlertTextView scheduleText;

    private EccItemScheduleInfoBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ScheduleAlertTextView scheduleAlertTextView) {
        this.rootView = linearLayout;
        this.scheduleIcon = imageView;
        this.scheduleText = scheduleAlertTextView;
    }

    @NonNull
    public static EccItemScheduleInfoBinding bind(@NonNull View view) {
        int i = R.id.schedule_icon;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.schedule_text;
            ScheduleAlertTextView scheduleAlertTextView = (ScheduleAlertTextView) pyb.a(view, i);
            if (scheduleAlertTextView != null) {
                return new EccItemScheduleInfoBinding((LinearLayout) view, imageView, scheduleAlertTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemScheduleInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemScheduleInfoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_schedule_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
