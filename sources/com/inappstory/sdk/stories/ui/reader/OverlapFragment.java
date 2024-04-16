package com.inappstory.sdk.stories.ui.reader;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.c;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.share.IASShareData;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.callbacks.OverlappingContainerActions;
import com.inappstory.sdk.stories.callbacks.ShareCallback;
import com.inappstory.sdk.stories.ui.OverlapFragmentObserver;
import com.inappstory.sdk.stories.ui.ScreensManager;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class OverlapFragment extends c {
    FrameLayout readerTopContainer;
    ShareCallback callback = CallbackManager.getInstance().getShareCallback();
    OverlappingContainerActions shareActions = new a();

    /* loaded from: classes3.dex */
    class a implements OverlappingContainerActions {
        a() {
        }

        @Override // com.inappstory.sdk.stories.callbacks.OverlappingContainerActions
        public void closeView(HashMap<String, Object> hashMap) {
            boolean z;
            if (hashMap.containsKey("shared")) {
                z = ((Boolean) hashMap.get("shared")).booleanValue();
            } else {
                z = false;
            }
            ScreensManager.getInstance().setTempShareStatus(z);
            OverlapFragmentObserver overlapFragmentObserver = ScreensManager.getInstance().overlapFragmentObserver;
            if (overlapFragmentObserver != null) {
                overlapFragmentObserver.closeView(hashMap);
            }
            ScreensManager.getInstance().cleanOverlapFragmentObserver();
            OverlapFragment.this.dismissAllowingStateLoss();
        }
    }

    /* loaded from: classes3.dex */
    class b implements DialogInterface.OnKeyListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4 && keyEvent.getAction() == 1) {
                OverlapFragment overlapFragment = OverlapFragment.this;
                if (!overlapFragment.callback.onBackPress(overlapFragment.shareActions)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OverlapFragmentObserver overlapFragmentObserver = ScreensManager.getInstance().overlapFragmentObserver;
        if (overlapFragmentObserver != null) {
            overlapFragmentObserver.viewIsOpened();
        }
        setStyle(2, R.style.OverlapDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.cs_overlap_dialog_fragment, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            dialog.setOnKeyListener(new b());
            View decorView = dialog.getWindow().getDecorView();
            dialog.getWindow().setLayout(-1, -1);
            decorView.setSystemUiVisibility(1028);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.readerTopContainer = (FrameLayout) view.findViewById(R.id.ias_stories_top_container);
        Context context = getContext();
        if (this.callback != null && context != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("slidePayload", getArguments().getString("slidePayload"));
            hashMap.put("storyId", Integer.valueOf(getArguments().getInt("storyId")));
            hashMap.put("slideIndex", Integer.valueOf(getArguments().getInt("slideIndex")));
            hashMap.put("shareData", JsonParser.fromJson(getArguments().getString("shareData"), IASShareData.class));
            this.readerTopContainer.removeAllViews();
            View view2 = this.callback.getView(context, hashMap, this.shareActions);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.readerTopContainer.addView(view2);
            this.readerTopContainer.setVisibility(0);
            this.callback.viewIsVisible(view2);
        }
    }
}
