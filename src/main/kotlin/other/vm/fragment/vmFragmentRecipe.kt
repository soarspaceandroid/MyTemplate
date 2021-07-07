
package other.vm.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.vm.fragment.res.layout.vmFragmentXml
import other.vm.fragment.src.app_package.vmFragmentKt
import other.vm.fragment.src.app_package.vmViewModel


fun RecipeExecutor.vmFragmentRecipe(
        moduleData: ModuleTemplateData,
        fragmentClass: String,
        layoutName: String,
        packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val vmfragment = vmFragmentKt(projectData.applicationPackage, fragmentClass, layoutName, packageName)
    // 保存Activity
    save(vmfragment, srcOut.resolve("${fragmentClass}Fragment.${ktOrJavaExt}"))
    // 保存xml
    save(vmFragmentXml(packageName, fragmentClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
    save(vmViewModel(packageName, fragmentClass), srcOut.resolve("${fragmentClass}ViewModel.${ktOrJavaExt}"))
}