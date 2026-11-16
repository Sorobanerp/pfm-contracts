SHELL := /bin/bash
PATH := $(HOME)/.local/bin:$(PATH)
BUF ?= buf

.PHONY: all lint breaking format generate clean help

all: lint generate

## lint: Run Buf linter against all Protobuf v3 contracts
lint:
	@echo "==> Running Buf lint on proto/..."
	$(BUF) lint

## breaking: Detect backward-incompatible breaking changes against main branch
breaking:
	@echo "==> Checking for breaking changes against .git#branch=main..."
	$(BUF) breaking --against '.git#branch=main'

## format: Format all .proto files in-place using Buf formatter
format:
	@echo "==> Formatting .proto files..."
	$(BUF) format -w

## generate: Generate Protobuf v3 + gRPC stubs for Golang, Java 25 LTS, and Python
generate:
	@echo "==> Cleaning previous generated stubs..."
	rm -rf gen/
	@echo "==> Generating Protobuf v3 + gRPC code (Go, Java 25 LTS, Python)..."
	$(BUF) generate
	@echo "==> Code generation complete under ./gen/{go,java,python}"

## clean: Remove generated code artifacts
clean:
	rm -rf gen/

## help: Show available Makefile targets
help:
	@grep -E '^## ' $(MAKEFILE_LIST) | sed 's/## /  /'
