package other.vm
import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.vm.activity.vmActivityTemplate
import other.vm.fragment.vmFragmentTemplate
class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
            // activity的模板
            vmActivityTemplate,
            // fragment的模板
            vmFragmentTemplate
    )
}