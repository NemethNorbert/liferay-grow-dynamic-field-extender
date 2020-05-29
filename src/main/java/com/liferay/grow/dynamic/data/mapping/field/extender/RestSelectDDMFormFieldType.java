package com.liferay.grow.dynamic.data.mapping.field.extender;

import org.osgi.service.component.annotations.Component;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;

/**
 * This custom form field type tells Liferay to use the properties defined in FieldExtenderTypeSettings.class
 * for the custom DDM structure "ddm-users".
 */
@Component(
		immediate = true,
		property = {
				"ddm.form.field.type.name=ddm-grow-select"
		},
		service = DDMFormFieldType.class
)
public class RestSelectDDMFormFieldType implements DDMFormFieldType {

	public Class<? extends DDMFormFieldTypeSettings> getDDMFormFieldTypeSettings() {
		return FieldExtenderDDMFormFieldTypeSettings.class;
	}
	// Field type name defined in “DDMFormFieldType” component should be with ddm-*
	public String getName() {
		return "ddm-grow-select";
	}
}