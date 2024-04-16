package im.threads.ui.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.useractivity.UserActivityTime;
import im.threads.business.useractivity.UserActivityTimeProvider;
import im.threads.business.utils.FileUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.QuickAnswerActivity;
import im.threads.ui.config.Config;
import im.threads.ui.fragments.QuickAnswerFragment;
import im.threads.ui.utils.ColorsHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuickAnswerFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lim/threads/ui/fragments/QuickAnswerFragment;", "Lim/threads/ui/fragments/BaseDialogFragment;", "()V", "editText", "Landroid/widget/EditText;", "getColorInt", "", "colorResId", "initSendButton", "", "style", "Lim/threads/ui/ChatStyle;", "view", "Landroid/view/View;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onResume", "onStart", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickAnswerFragment extends BaseDialogFragment {
    public static final Companion Companion = new Companion(null);
    public static String TAG;
    private EditText editText;

    /* compiled from: QuickAnswerFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lim/threads/ui/fragments/QuickAnswerFragment$Companion;", "", "()V", "TAG", "", "getInstance", "Lim/threads/ui/fragments/QuickAnswerFragment;", "avatarPath", "consultName", "consultPhrase", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QuickAnswerFragment getInstance(String str, String str2, String str3) {
            QuickAnswerFragment quickAnswerFragment = new QuickAnswerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("avatarPath", str);
            bundle.putString("consultName", str2);
            bundle.putString("consultPhrase", str3);
            quickAnswerFragment.setArguments(bundle);
            return quickAnswerFragment;
        }
    }

    static {
        String simpleName = QuickAnswerFragment.class.getSimpleName();
        z65.g(simpleName, "QuickAnswerFragment::class.java.simpleName");
        TAG = simpleName;
    }

    private final int getColorInt(int i) {
        return iu1.c(requireContext(), i);
    }

    public static final QuickAnswerFragment getInstance(String str, String str2, String str3) {
        return Companion.getInstance(str, str2, str3);
    }

    private final void initSendButton(ChatStyle chatStyle, View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.send);
        imageButton.setImageResource(chatStyle.sendMessageIconResId);
        int i = chatStyle.chatBodyIconsTint;
        if (i == 0) {
            i = chatStyle.inputIconTintResId;
        }
        ColorsHelper.setTint(requireContext(), imageButton, i);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: fv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuickAnswerFragment.initSendButton$lambda$2(QuickAnswerFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSendButton$lambda$2(QuickAnswerFragment quickAnswerFragment, View view) {
        Editable editable;
        int i;
        boolean z;
        z65.h(quickAnswerFragment, "this$0");
        EditText editText = quickAnswerFragment.editText;
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (z65.j(valueOf.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        if (valueOf.subSequence(i2, length + 1).toString().length() == 0) {
            return;
        }
        Intent intent = new Intent(QuickAnswerActivity.ACTION_ANSWER);
        EditText editText2 = quickAnswerFragment.editText;
        if (editText2 != null) {
            editable2 = editText2.getText();
        }
        Intent putExtra = intent.putExtra(QuickAnswerActivity.ACTION_ANSWER, String.valueOf(editable2));
        z65.g(putExtra, "Intent(QuickAnswerActivi…ditText?.text.toString())");
        cs5.b(quickAnswerFragment.requireContext()).d(putExtra);
        EditText editText3 = quickAnswerFragment.editText;
        if (editText3 != null) {
            editText3.setText("");
        }
        quickAnswerFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(QuickAnswerFragment quickAnswerFragment, View view) {
        z65.h(quickAnswerFragment, "this$0");
        cs5.b(quickAnswerFragment.requireContext()).d(new Intent(QuickAnswerActivity.ACTION_CANCEL));
        quickAnswerFragment.dismiss();
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        final Context requireContext = requireContext();
        final int theme = getTheme();
        Dialog dialog = new Dialog(requireContext, theme) { // from class: im.threads.ui.fragments.QuickAnswerFragment$onCreateDialog$dialog$1
            @Override // android.app.Dialog, android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                z65.h(motionEvent, "ev");
                UserActivityTime lastUserActivityTimeCounter = UserActivityTimeProvider.INSTANCE.getLastUserActivityTimeCounter();
                if (motionEvent.getAction() == 0) {
                    lastUserActivityTimeCounter.updateLastUserActivityTime();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        int i = (int) (getResources().getDisplayMetrics().widthPixels * 0.9f);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(i, -2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        z65.h(layoutInflater, "inflater");
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        View inflate = layoutInflater.inflate(R.layout.ecc_dialog_fast_answer, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.consult_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.question);
        this.editText = (EditText) inflate.findViewById(R.id.answer);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.consult_image);
        z65.g(inflate, "view");
        initSendButton(chatStyle, inflate);
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: gv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickAnswerFragment.onCreateView$lambda$0(QuickAnswerFragment.this, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("avatarPath");
            String string2 = arguments.getString("consultName");
            String string3 = arguments.getString("consultPhrase");
            if (string != null && !z65.c(string, "null")) {
                ImageLoader modifications = ImageLoader.Companion.get().load(FileUtils.convertRelativeUrlToAbsolute(string)).scales(ImageView.ScaleType.FIT_XY).modifications(ImageModifications.CircleCropModification.INSTANCE);
                z65.g(imageView, "imageView");
                modifications.into(imageView);
            }
            if (string2 != null && !z65.c(string2, "null")) {
                textView.setText(string2);
            }
            if (string3 != null && !z65.c(string3, "null")) {
                textView2.setText(string3);
            }
        }
        inflate.findViewById(R.id.layout_root).setBackgroundColor(getColorInt(chatStyle.chatBackgroundColor));
        inflate.findViewById(R.id.header).setBackgroundColor(getColorInt(chatStyle.chatToolbarColorResId));
        textView.setTextColor(getColorInt(chatStyle.chatToolbarTextColorResId));
        textView2.setTextColor(getColorInt(chatStyle.notificationQuickReplyMessageTextColor));
        textView2.setBackgroundColor(getColorInt(chatStyle.notificationQuickReplyMessageBackgroundColor));
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTextColor(getColorInt(chatStyle.incomingMessageTextColor));
        }
        inflate.findViewById(R.id.answer_layout).setBackgroundColor(getColorInt(chatStyle.chatMessageInputColor));
        EditText editText2 = this.editText;
        if (editText2 != null) {
            editText2.setHintTextColor(getColorInt(chatStyle.chatMessageInputHintTextColor));
        }
        EditText editText3 = this.editText;
        if (editText3 != null) {
            layoutParams = editText3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = (int) requireContext().getResources().getDimension(chatStyle.inputHeight);
        }
        EditText editText4 = this.editText;
        if (editText4 != null) {
            editText4.setBackground(on.b(requireContext(), chatStyle.inputBackground));
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseConfig.Companion.getInstance().transport.setLifecycle(null);
    }

    @Override // im.threads.ui.fragments.BaseDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        androidx.fragment.app.d activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        EditText editText = this.editText;
        if (editText != null) {
            if (editText != null) {
                editText.requestFocus();
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(5);
            }
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseConfig.Companion.getInstance().transport.setLifecycle(getLifecycle());
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i = getResources().getDisplayMetrics().widthPixels;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(i, -2);
            }
        }
    }
}
