package com.aldi.sap.odata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "free_text_message")
public class FreeTextMessageEntity {
    @Id
    @Column(name = "trigger_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "free_text_trigger_id")
    private String free_text_trigger_id;
    @Column(name = "free_text_trigger_name")
    private String free_text_trigger_name;
    @Column(name = "free_text_message")
    private String free_text_message;
    @Column(name = "template_type")
    private String template_type;
    @Column(name = "date_activated")
    private String date_activated;
    @Column(name = "activated_by")
    private String activated_by;
    @Column(name = "date_deactivated")
    private String date_deactivated;
    @Column(name = "deactivated_by")
    private String deactivated_by;
    @Column(name = "status")
    private String status;
    @Column(name = "development_progress")
    private int development_progress;
    @Column(name = "supplier_id")
    private String supplier_id;
    @Column(name = "variant_id")
    private String variant_id;
    @Column(name = "outl_agreement")
    private String outl_agreement;
    @Column(name = "po_number")
    private String po_number;
    @Column(name = "modified_by")
    private String modified_by;
    @Column(name = "aldi_instance_id")
    private int aldi_instance_id;
    @Column(name = "created_date")
    private String createdOn;
    @Column(name = "created_by")
    private String createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getFree_text_trigger_id() {
        return free_text_trigger_id;
    }

    public void setFree_text_trigger_id(String free_text_trigger_id) {
        this.free_text_trigger_id = free_text_trigger_id;
    }

    public String getFree_text_trigger_name() {
        return free_text_trigger_name;
    }

    public void setFree_text_trigger_name(String free_text_trigger_name) {
        this.free_text_trigger_name = free_text_trigger_name;
    }

    public String getFree_text_message() {
        return free_text_message;
    }

    public void setFree_text_message(String free_text_message) {
        this.free_text_message = free_text_message;
    }

    public String getTemplate_type() {
        return template_type;
    }

    public void setTemplate_type(String template_type) {
        this.template_type = template_type;
    }

    public String getDate_activated() {
        return date_activated;
    }

    public void setDate_activated(String date_activated) {
        this.date_activated = date_activated;
    }

    public String getActivated_by() {
        return activated_by;
    }

    public void setActivated_by(String activated_by) {
        this.activated_by = activated_by;
    }

    public String getDate_deactivated() {
        return date_deactivated;
    }

    public void setDate_deactivated(String date_deactivated) {
        this.date_deactivated = date_deactivated;
    }

    public String getDeactivated_by() {
        return deactivated_by;
    }

    public void setDeactivated_by(String deactivated_by) {
        this.deactivated_by = deactivated_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDevelopment_progress() {
        return development_progress;
    }

    public void setDevelopment_progress(int development_progress) {
        this.development_progress = development_progress;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getVariant_id() {
        return variant_id;
    }

    public void setVariant_id(String variant_id) {
        this.variant_id = variant_id;
    }

    public String getOutl_agreement() {
        return outl_agreement;
    }

    public void setOutl_agreement(String outl_agreement) {
        this.outl_agreement = outl_agreement;
    }

    public String getPo_number() {
        return po_number;
    }

    public void setPo_number(String po_number) {
        this.po_number = po_number;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public int getAldi_instance_id() {
        return aldi_instance_id;
    }

    public void setAldi_instance_id(int aldi_instance_id) {
        this.aldi_instance_id = aldi_instance_id;
    }

}
