// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorPatientBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView appointmentRecyclerview;

  @NonNull
  public final TextView bookText;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final TextView selectDate;

  @NonNull
  public final TextView selectDateTextToHide;

  @NonNull
  public final TextView signUph2;

  private ActivityDoctorPatientBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView appointmentRecyclerview, @NonNull TextView bookText,
      @NonNull ConstraintLayout linearLayout, @NonNull TextView selectDate,
      @NonNull TextView selectDateTextToHide, @NonNull TextView signUph2) {
    this.rootView = rootView;
    this.appointmentRecyclerview = appointmentRecyclerview;
    this.bookText = bookText;
    this.linearLayout = linearLayout;
    this.selectDate = selectDate;
    this.selectDateTextToHide = selectDateTextToHide;
    this.signUph2 = signUph2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorPatientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorPatientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_patient, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorPatientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appointment_recyclerview;
      RecyclerView appointmentRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (appointmentRecyclerview == null) {
        break missingId;
      }

      id = R.id.book_text;
      TextView bookText = ViewBindings.findChildViewById(rootView, id);
      if (bookText == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      ConstraintLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.selectDate;
      TextView selectDate = ViewBindings.findChildViewById(rootView, id);
      if (selectDate == null) {
        break missingId;
      }

      id = R.id.selectDateTextToHide;
      TextView selectDateTextToHide = ViewBindings.findChildViewById(rootView, id);
      if (selectDateTextToHide == null) {
        break missingId;
      }

      id = R.id.signUph2;
      TextView signUph2 = ViewBindings.findChildViewById(rootView, id);
      if (signUph2 == null) {
        break missingId;
      }

      return new ActivityDoctorPatientBinding((ConstraintLayout) rootView, appointmentRecyclerview,
          bookText, linearLayout, selectDate, selectDateTextToHide, signUph2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}