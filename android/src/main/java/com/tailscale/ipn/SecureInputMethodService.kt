// Copyright (c) Tailscale Inc & AUTHORS
// SPDX-License-Identifier: BSD-3-Clause
package com.tailscale.ipn

import android.inputmethodservice.InputMethodService
import android.view.View

class SecureInputMethodService : InputMethodService() {
  override fun onCreateInputView(): View {
    // Inflate your custom keyboard layout here.
    // For example, a simple numeric keypad for PINs.
    // Ensure this layout does not use external libraries or log input.
    val view = layoutInflater.inflate(R.layout.secure_keyboard_layout, null)
    // Wire up key buttons to commitText() method
    // Example: view.findViewById<Button>(R.id.key_1).setOnClickListener { currentInputConnection?.commitText("1", 1) }
    return view
  }

  // Implement other necessary InputMethodService methods like onStartInput, onKey, etc.
  // Ensure no sensitive data is logged or cached within this service.
}
