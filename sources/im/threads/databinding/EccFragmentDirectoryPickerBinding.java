package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccFragmentDirectoryPickerBinding {
    @NonNull
    public final ListView folderList;
    @NonNull
    private final FrameLayout rootView;

    private EccFragmentDirectoryPickerBinding(@NonNull FrameLayout frameLayout, @NonNull ListView listView) {
        this.rootView = frameLayout;
        this.folderList = listView;
    }

    @NonNull
    public static EccFragmentDirectoryPickerBinding bind(@NonNull View view) {
        int i = R.id.folder_list;
        ListView listView = (ListView) pyb.a(view, i);
        if (listView != null) {
            return new EccFragmentDirectoryPickerBinding((FrameLayout) view, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccFragmentDirectoryPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccFragmentDirectoryPickerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_fragment_directory_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
