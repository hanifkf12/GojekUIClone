package com.mayburger.gojekuiclone.ui.main.fragments.promos


import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.mayburger.gojekuiclone.BR
import com.mayburger.gojekuiclone.R
import com.mayburger.gojekuiclone.databinding.FragmentMainPromosBinding
import com.mayburger.gojekuiclone.ui.base.BaseFragment
import com.mayburger.gojekuiclone.util.ext.sheetBehavior
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main_promos.*

@AndroidEntryPoint
class MainPromosFragment : BaseFragment<FragmentMainPromosBinding, MainPromosViewModel>(),
    MainPromosNavigator {

    override val bindingVariable: Int
        get() = BR.viewModel
    override val layoutId: Int
        get() = R.layout.fragment_main_promos
    override val viewModel: MainPromosViewModel by viewModels()
    lateinit var behavior: BottomSheetBehavior<*>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        behavior = bottomSheet.sheetBehavior()
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        behavior.peekHeight = height/2
        behavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}