package com.nourology.reports.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Report DTO class
 */
@Data
@NoArgsConstructor
public class Report {
    private String title;
    private String name;
    private List<Parameter> parameters;

    public Report(String title, String name) {
        this.setTitle(title);
        this.setName(name);
    }

    @Data
    @NoArgsConstructor
    //@AllArgsConstructor
    public static class Parameter {
        private String title;
        private String name;
        private ParameterType type;

        public Parameter(String title, String name, ParameterType type) {
            this.title = title;
            this.name = name;
            this.type = type;
        }

    }

    public enum ParameterType {
        INT, STRING
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    private void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
